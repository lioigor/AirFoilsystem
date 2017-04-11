package com.lioigor22.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lioigor22.objects.Experiment;
import com.lioigor22.services.ExperimentService;

@Controller
public class ExperimentController {

	@Autowired
	private ExperimentService experimentService;

	@RequestMapping(value = { "/experiment" }, method = RequestMethod.GET)
	public String home(Model model) {

		model.addAttribute("experiment", new Experiment());

		return "experiment";
	}

	@Qualifier(value = "experimentService")
	public void setExperimentService(ExperimentService ps) {
		this.experimentService = ps;
	}

	@RequestMapping(value = "/experiments", method = RequestMethod.GET)
	public String listExperiments(Model model) {
		model.addAttribute("experiment", new Experiment());
		model.addAttribute("listExperiments", this.experimentService.findAll());
		return "experiment";
	}

	@RequestMapping(value = "/experiments", method = RequestMethod.POST)
	public String existingExperiments(Model model) {
		model.addAttribute("experiment", new Experiment());
		model.addAttribute("listExperiments", this.experimentService.findAll());
		return "experiment";
	}

	// For add and update experiment both
	@RequestMapping(value = "/experiment/add", method = RequestMethod.POST)
	public String addExperiment(@ModelAttribute("experiment") Experiment exp) {

		if (exp.getId() == 0) {
			// new experiment, add it
			this.experimentService.add(exp);
		} else {
			// existing experiment, call update
			this.experimentService.update(exp);
		}

		return "redirect:/experiments";

	}

	@RequestMapping("/remove/{id}")
	public String removeExperiment(@PathVariable("id") Long id) {

		this.experimentService.removeById(id);
		return "redirect:/experiments";
	}

	@RequestMapping("/edit/{id}")
	public String editExperiment(@PathVariable("id") Long id, Model model) {
		model.addAttribute("experiment", this.experimentService.getById(id));
		model.addAttribute("listExperiments", this.experimentService.findAll());

		return "experiment";
	}

}
