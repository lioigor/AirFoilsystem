package com.lioigor22.controllers;

import java.security.Principal;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller

public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@Autowired
	private AccessDecisionManager accessDecisionManager;

	@RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
	public ModelAndView accesssDenied(Principal user) {

		ModelAndView model = new ModelAndView();

		if (user != null) {
			model.addObject("username", user.getName());
			model.addObject("errorMsg", " you do not have access to this page!");
		} else {
			model.addObject("errorMsg", "You do not have access to this page!");
		}

		model.setViewName("/accessDenied");
		return model;

	}

	@RequestMapping(value = { "/", "/home" })
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		return "home";
	}

	@RequestMapping(value = "/failed", method = RequestMethod.GET)
	public ModelAndView failed() {
		return new ModelAndView("error", "message", "Login failed!");
	}

	@RequestMapping(value = "/contacts")
	public String contacts() {

		return "contacts";
	}

	@RequestMapping(value = "/downloads")
	public String downloads() {

		return "downloads";
	}

	@RequestMapping(value = "/support")
	public String support() {

		return "support";
	}

	@RequestMapping(value = "/404")
	public String error() {

		return "404";
	}

}
