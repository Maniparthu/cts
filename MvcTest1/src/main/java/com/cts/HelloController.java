package com.cts;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/parthu")
public class HelloController {
	
   @RequestMapping("/hello")
   String hello() {
		 return "hello";
	 }
   @RequestMapping(value="/listemp")
	public String listEmp(){
		return "listemp";
	}
	@RequestMapping(value="/saveemp")
	public String saveEmp()
	{
		return "saveemp";
	}
}