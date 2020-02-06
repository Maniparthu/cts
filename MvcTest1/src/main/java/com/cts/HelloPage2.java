package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloPage2 {
	@RequestMapping(value="/page2", method=RequestMethod.GET)
	public void page2(Model model) {
		model.addAttribute("modelMsg", "The view automaticly loaded...(page2.jsp)");
	}
}
