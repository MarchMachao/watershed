package com.smates.dbc2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smates.dbc2.service.GoalsService;
import com.smates.dbc2.service.UserService;

@Controller
public class GoalsController {

	@Autowired
	private GoalsService goalsService;

	@Autowired
	private UserService userService;

	@RequestMapping("getGoalsByProjectid")
	public String getGoalsByProjectid(Model model) {
		model.addAttribute("goalslist", goalsService.getGoalsByProjectid("default"));
//		model.addAttribute("goalslist", goalsService.getGoalsByProjectid(userService.getCurrentUserId()));
		return "goals.ftl";
	}
}
