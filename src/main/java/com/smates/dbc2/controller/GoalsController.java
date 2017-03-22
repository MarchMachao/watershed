package com.smates.dbc2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smates.dbc2.po.Goals;
import com.smates.dbc2.service.GoalsService;
import com.smates.dbc2.service.UserProjectRelationService;
import com.smates.dbc2.service.UserService;

@Controller
public class GoalsController {

	@Autowired
	private GoalsService goalsService;

	@Autowired
	private UserService userService;

	@Autowired
	private UserProjectRelationService userProjectRelationService;

	@RequestMapping("getGoalsByProjectid")
	public String getGoalsByProjectid(Model model) {
		// model.addAttribute("goalslist",
		// goalsService.getGoalsByProjectid("default"));
		String projectId = userProjectRelationService.getUserProjectRelationByUserName(userService.getCurrentUserId())
				.getAutoProjectId();
		List<Goals> goalslist = new ArrayList<Goals>(goalsService.getGoalsByProjectid(projectId));
		if (goalslist.isEmpty()) {
			goalslist = goalsService.getDefaultGoals();
			for (int i = 0; i < goalslist.size(); i++) {
				goalslist.get(i).setProjectID(projectId);
				goalsService.addOneGoal(goalslist.get(i));
			}
		}
		model.addAttribute("goalslist", goalslist);
		System.out.println(projectId);
		return "goals.ftl";
	}
}
