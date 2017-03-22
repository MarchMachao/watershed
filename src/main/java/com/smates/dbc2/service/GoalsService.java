package com.smates.dbc2.service;

import java.util.List;

import com.smates.dbc2.po.Goals;

public interface GoalsService {

	/**
	 * 获取某项目下的目标
	 * 
	 * @param projectId
	 * @return
	 */
	public List<Goals> getGoalsByProjectid(String projectId);

	/**
	 * 获取默认目标
	 * 
	 * @return
	 */
	public List<Goals> getDefaultGoals();

	/**
	 * 添加目标
	 * 
	 * @param goals
	 */
	public void addOneGoal(Goals goals);
}
