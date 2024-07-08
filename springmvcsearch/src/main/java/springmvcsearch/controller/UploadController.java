package springmvcsearch.controller;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class UploadController {

	@RequestMapping("/file")
	public String showForm() {
		return "fileForm";
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String formHandle(@RequestParam("profile") CommonsMultipartFile file, HttpSession s, Model m) {
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());

		System.out.println();

		byte[] data = file.getBytes();

		String path = s.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources" + File.separator
				+ "images" + File.separator + file.getOriginalFilename();

		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("file uploaded successfully");
			m.addAttribute("msg","file uploaded successfully!!!!!");
			m.addAttribute("file",file.getOriginalFilename());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("upload error.....");
			
		}
		return "fileResult";
	}

}
