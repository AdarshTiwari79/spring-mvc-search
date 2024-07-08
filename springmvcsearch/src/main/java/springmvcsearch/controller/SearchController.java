package springmvcsearch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String homeController()
	{
		System.out.println("This is home handler running ...");
		return "home";
	}
	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public RedirectView formHandler(@RequestParam(name="querybox",required = false) String query)
	{
		String forException = null;
		System.out.println(forException.length());
		String url = "https://www.google.com/search?q="+query;
		System.out.println("your query is "+query);
		RedirectView redirectView = new RedirectView();
		if(query==null)
		{
			redirectView.setUrl("home");
		}else {
			redirectView.setUrl(url);
		}
		
		return redirectView;
	}
	
	/* Handling NullPointerException */
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(NullPointerException.class)
	public String exceptionHandler(Model m)
	{
		m.addAttribute("msg","NullPointerException has occured.");
		return "error";
	}

}
