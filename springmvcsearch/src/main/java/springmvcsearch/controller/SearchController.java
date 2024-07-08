package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

}
