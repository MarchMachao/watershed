package com.smates.dbc2.mapper;

import java.util.List;

import com.smates.dbc2.po.Goals;

public interface GoalsDao {

	/**
	 * 获取项目下的所有目标
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
	 * 添加一个目标
	 * 
	 * @param goals
	 */
	public void addOneGoal(Goals goal);

	/**
	 * 批量插入目标
	 * 
	 * @param goals
	 */
	public void addGoals(List<Goals> goals);
}
