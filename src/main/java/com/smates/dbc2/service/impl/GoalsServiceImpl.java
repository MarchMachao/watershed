package com.smates.dbc2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smates.dbc2.mapper.GoalsDao;
import com.smates.dbc2.po.Goals;
import com.smates.dbc2.service.GoalsService;

@Service
public class GoalsServiceImpl implements GoalsService {

	@Autowired
	private GoalsDao goalsDao;

	@Override
	public List<Goals> getGoalsByProjectid(String projectId) {
		return goalsDao.getGoalsByProjectid(projectId);
	}

	@Override
	public List<Goals> getDefaultGoals() {
		return goalsDao.getDefaultGoals();
	}

	@Override
	public void addOneGoal(Goals goals) {
		goalsDao.addOneGoal(goals);
	}

}
