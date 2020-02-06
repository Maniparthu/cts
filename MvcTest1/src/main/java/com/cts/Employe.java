package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Employe {

	
	 
	
	@RequestMapping(value="/path_variable/{empname}/{empage}")
	public String rqPathVariable(Model model, 
								 @PathVariable String empname, 
								 @PathVariable int empage) {
		model.addAttribute("empname", empname);
		model.addAttribute("empage", empage);
		return "path_variable";
	}
	
}
