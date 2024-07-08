package springmvcsearch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GeneralExceptionHandler {

	
	/* To handle NullPointerException */
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String nullPointException(Model m)
	{
		System.out.println("Exception handler is activated");
		m.addAttribute("msg","NullPointerException has occured..");
		return "error";
	}
	
	/* To handle general exceptions */
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String generalException(Model model)
	{
		model.addAttribute("msg","Server side exception occured.");
		return "error";
	}
}
