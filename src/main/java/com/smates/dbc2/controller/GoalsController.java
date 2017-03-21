package com.smates.dbc2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smates.dbc2.po.Goals;
import com.smates.dbc2.service.GoalsService;

@Controller
public class GoalsController {

	@Autowired
	private GoalsService goalsService;

	@ResponseBody
	@RequestMapping("getGoalsByProjectid")
	public List<Goals> getGoalsByProjectid(String projectID){
		return goalsService.getGoalsByProjectid(projectID);
	}
}
