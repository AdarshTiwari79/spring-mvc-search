package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvcsearch.model.User;

@Controller
public class FormController {
	
	@RequestMapping("/{name}")
	public String testPathVariable(@PathVariable("name") String name,Model m)
	{
		System.out.println("path variable handler is running...");
		System.out.println("name bind from path variable handler is : "+name);
		m.addAttribute("msg","Message from PathVariable handler");
		m.addAttribute("name",name);
		return "form";
	}
	
	@RequestMapping("/form")
	public String toShow()
	{
		System.out.println("form handler is running to handle form.");
		return "form";
	}
	
	@RequestMapping(path="/submit",method=RequestMethod.POST)
	public String formHandler(@ModelAttribute("user") User user,BindingResult result )
	{
		if(result.hasErrors())
		{
			return "form";
		}
		System.out.println(user);
		System.out.println(user.getAddress());
		return "result";
	}
	
	

}
