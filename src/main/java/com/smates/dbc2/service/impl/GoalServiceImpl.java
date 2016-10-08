package com.smates.dbc2.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smates.dbc2.mapper.GoalDao;
import com.smates.dbc2.po.Goal;
import com.smates.dbc2.service.GoalService;

@Service
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalDao goalDao;

	@Override
	public void addGoal(String goal_1, String goal_2, String goal_3, String index_111, String index_112,
			String index_121, String index_131, String index_132, String index_141, String index_142, String index_143,
			String index_144, String index_211, String index_221, String index_231, String index_311, String index_321,
			String index_331, String index_332, String index_341, String index_342, String index_351, String index_352,
			String index_361, String index_371, String index_372, String index_373, String index_381,
			String index_382) {
		goalDao.addGoal(new Goal(UUID.randomUUID().toString(), goal_1, goal_2, goal_3, index_111, index_112, index_121,
				index_131, index_132, index_141, index_142, index_143, index_144, index_211, index_221, index_231,
				index_311, index_321, index_331, index_332, index_341, index_342, index_351, index_352, index_361,
				index_371, index_372, index_373, index_381, index_382));
	}

}
