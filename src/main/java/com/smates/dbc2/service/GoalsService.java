package com.smates.dbc2.service;

import java.util.List;

import com.smates.dbc2.po.Goals;

public interface GoalsService {

	public List<Goals> getGoalsByProjectid(String projectId);
}
