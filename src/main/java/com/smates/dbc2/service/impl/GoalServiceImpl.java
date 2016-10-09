package com.smates.dbc2.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smates.dbc2.mapper.GoalDao;
import com.smates.dbc2.po.Goal;
import com.smates.dbc2.service.GoalService;
import com.smates.dbc2.utils.StringUtils;
import com.smates.dbc2.vo.Node;

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

	@Override
	public Node getGoalTreeById(String id) {
		Node root = new Node();
		Node node1 = new Node();
		Node node11 = null;
		Node node12 = null;
		Node node13 = null;
		Node node14 = null;
		Goal goal = goalDao.getGoalById(id);
		node1.setName("为所有人提供水和环境卫生，为所有用水部门提供可持续的供水和取水，并进行流域水资源的可持续管理"+goal.getGoal_1()+"%");
		List<Node> node1child = new ArrayList<Node>();
		
		String index_111 = goal.getIndex_111();
		String index_112 = goal.getIndex_112();
		if (!StringUtils.isEmpty(index_111) || !StringUtils.isEmpty(index_112)) {
			node11 = new Node();
			node11.setName("提高水资源利用率");
			List<Node> children = new ArrayList<Node>();
			if (!StringUtils.isEmpty(index_111)) {
				children.add(new Node("提高水生产力到"+index_111+"%", null));
			}
			if (!StringUtils.isEmpty(index_112)) {
				children.add(new Node("提高水生产力到"+index_112+"%", null));
			}
			node11.setChildren(children);
			node1child.add(node11);
		}
		
		String index_121 = goal.getIndex_121();
		if (!StringUtils.isEmpty(index_121)) {
			node12 = new Node();
			node12.setName("人人可以公平享受负担得起的安全饮用水");
			List<Node> children = new ArrayList<Node>();
			children.add(new Node(" 提高流域社会安全饮用水比例到"+index_121+"%", null));
			node12.setChildren(children);
			node1child.add(node12);
		}
		
		String index_131 = goal.getIndex_131();
		String index_132 = goal.getIndex_132();
		if (!StringUtils.isEmpty(index_131) || !StringUtils.isEmpty(index_132)) {
			node13 = new Node();
			node13.setName("在所有层次上实现集成水资源管理，包括跨边界合作");
			List<Node> children = new ArrayList<Node>();
			if (!StringUtils.isEmpty(index_131)) {
				children.add(new Node("集成水资源管理执行度"+index_131+"%", null));
			}
			if (!StringUtils.isEmpty(index_132)) {
				children.add(new Node("跨边界流域可操作合约有效性"+index_132+"%", null));
			}
			node13.setChildren(children);
			node1child.add(node13);
		}
		
		String index_141 = goal.getIndex_141();
		String index_142 = goal.getIndex_142();
		String index_143 = goal.getIndex_143();
		String index_144 = goal.getIndex_144();
		if (!StringUtils.isEmpty(index_141) || !StringUtils.isEmpty(index_142) || !StringUtils.isEmpty(index_143) || !StringUtils.isEmpty(index_144)) {
			node14 = new Node();
			node14.setName("保护和恢复与水相关的生态系统，包括湿地，森林，草地，湖泊和地下蓄水层");
			List<Node> children = new ArrayList<Node>();
			if (!StringUtils.isEmpty(index_141)) {
				children.add(new Node("维持可持续中游湿地面积"+index_141+"万亩", null));
			}
			if (!StringUtils.isEmpty(index_142)) {
				children.add(new Node("中游地下水最大开采量"+index_142+"亿m3", null));
			}
			if (!StringUtils.isEmpty(index_143)) {
				children.add(new Node("中游生态系统最小供水量"+index_143+"亿m3", null));
			}
			if (!StringUtils.isEmpty(index_144)) {
				children.add(new Node("维持下游可持续生态系统发展所需最小分水量"+index_144+"亿m3", null));
			}
			node14.setChildren(children);
			node1child.add(node14);
		}
		node1.setChildren(node1child);
		
		
		
		
		
		
		return node1;
	}

}
