package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvcsearch.model.User;

@Controller
public class FormController {
	
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
