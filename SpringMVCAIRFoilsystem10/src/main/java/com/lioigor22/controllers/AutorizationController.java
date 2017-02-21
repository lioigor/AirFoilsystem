package com.lioigor22.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AutorizationController {

	private static final Logger logger = LoggerFactory.getLogger(AutorizationController.class);

	@RequestMapping(value = { "/", "/login" }, method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username or password!");
		}

		model.setViewName("login");

		return model;

	}

	// private UserService userService;
	//
	// @RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	// public String home(Model model) {
	//
	// model.addAttribute("user", new User());
	//
	// return "login";
	// }
	//
	// @RequestMapping(value = { "/register" }, method = RequestMethod.GET)
	// public String registry(Model model) {
	//
	// model.addAttribute("user", new User());
	//
	// return "register";
	// }
	//
	// @Autowired(required = true)
	// @Qualifier(value = "userService")
	// public void setUserService(UserService ps) {
	// this.userService = ps;
	// }
	//
	// @RequestMapping(value = "/login/users", method = RequestMethod.GET)
	// public String listUsers(Model model) {
	// model.addAttribute("user", new User());
	// model.addAttribute("listUsers", this.userService.listUsers());
	// return "user";
	// }
	//
	// // For add and update user both
	// @RequestMapping(value = "/login/add", method = RequestMethod.POST)
	// public String addUser(@ModelAttribute("user") User p, Model model) {
	//
	// boolean check = this.userService.checkLogin(p);
	// model.addAttribute("check", check);
	//
	// if (check)
	// return "register";
	// else {
	// this.userService.addUser(p);
	// model.addAttribute("regsuccess", true);
	//
	// return "home";
	// }
	//
	// }
	//
	// @RequestMapping("/login/remove/{id}")
	// public String removeUser(@PathVariable("id") int id) {
	//
	// this.userService.removeUser(id);
	// return "redirect:/users";
	// }
	//
	// @RequestMapping("/login/edit/{id}")
	// public String editUser(@PathVariable("id") int id, Model model) {
	// model.addAttribute("user", this.userService.getUserById(id));
	// model.addAttribute("listUsers", this.userService.listUsers());
	// return "user";
	// }
	//
	// @RequestMapping(value = "/login/check", method = RequestMethod.POST)
	// public String checkUser(@ModelAttribute("user") User user, Model model) {
	//
	// boolean check = this.userService.checkUser(user);
	// model.addAttribute("check", check);
	// if (check)
	// return "home";
	// else
	// model.addAttribute("check", true);
	// return "login";
	// }

}
