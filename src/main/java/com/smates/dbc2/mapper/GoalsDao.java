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
}
