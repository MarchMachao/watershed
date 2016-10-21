package com.smates.dbc2.service;

import com.smates.dbc2.po.Goal;
import com.smates.dbc2.vo.Node;

/**
 * 
 * @author baijw
 *
 */
public interface GoalService {

	/**
	 * 新增一个目标体系
	 * @param goal
	 */
	public void addGoal(String projectId, String goal_1, String goal_2, String goal_3, String index_111, String index_112, String index_121,
			String index_131, String index_132, String index_141, String index_142, String index_143, String index_144,
			String index_211, String index_221, String index_231, String index_311, String index_321, String index_331,
			String index_332, String index_341, String index_342, String index_351, String index_352, String index_361,
			String index_371, String index_372, String index_373, String index_381, String index_382);
	
	public Node getGoalTreeById(String id);
	
	public Goal getGoalById(String id);
	
	/**
	 * 删除一个项目的目标体系
	 * @param id
	 */
	public void deleteGoalById(String id);
	
	
	
}
