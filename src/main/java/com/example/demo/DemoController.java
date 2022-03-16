package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/save")
	public ModelAndView save(@ModelAttribute User user1) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user-data");
		modelAndView.addObject(user1);
		return modelAndView;
		
	}
}
