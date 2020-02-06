package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Hello1 {
	@RequestMapping(value="/page1", method=RequestMethod.GET)
	public String page1(Model model) {
		model.addAttribute("pag1msg", "The model is automaticly populated at request ...");
		return "page1";
	}

}
