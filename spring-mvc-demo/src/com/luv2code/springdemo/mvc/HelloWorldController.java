package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	// need a controller method to show the form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	// need a controller meyhod to process a from
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	// new controller to read form data and add to the model
	@RequestMapping("/processFormTwo")
	public String processFormTwo(HttpServletRequest request, Model model) {
		// Read parameter from the html form
		String name = request.getParameter("name").toUpperCase();
		String email = request.getParameter("email").toUpperCase();
		String userName = request.getParameter("username").toUpperCase();

		// add data to the model
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("userName", userName);

		return "helloworld";
	}

	// This method is used to read from data using @RequestParam and add to the
	// model
	@RequestMapping("/processFormThree")
	public String upperCaseVal(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("username") String username, Model model) {
		// add data to the model
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("userName", username);
		return "helloworld";
	}
}
