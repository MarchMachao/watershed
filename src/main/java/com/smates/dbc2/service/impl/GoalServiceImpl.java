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
	public void addGoal(String projectId, String goal_1, String goal_2, String goal_3, String index_111, String index_112,
			String index_121, String index_131, String index_132, String index_141, String index_142, String index_143,
			String index_144, String index_211, String index_221, String index_231, String index_311, String index_321,
			String index_331, String index_332, String index_341, String index_342, String index_351, String index_352,
			String index_361, String index_371, String index_372, String index_373, String index_381,
			String index_382) {
		goalDao.addGoal(new Goal(projectId, goal_1, goal_2, goal_3, index_111, index_112, index_121,
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
		Node node21 = null;
		Node node22 = null;
		Node node23 = null;
		Node node31 = null;
		Node node32 = null;
		Node node33 = null;
		Node node34 = null;
		Node node35 = null;
		Node node36 = null;
		Node node37 = null;
		Node node38 = null;
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
		
		
		Node node2 = new Node();
		node2.setName("保护、恢复和促进流域可持续利用陆地生态系统健康发展，可持续管理森林，防治荒漠化"+goal.getGoal_2()+"%");
		List<Node> node2child = new ArrayList<Node>();
		String index_211 = goal.getIndex_211();
		if (!StringUtils.isEmpty(index_211)) {
			node21 = new Node();
			node21.setName(" 提高水资源利用率");
			List<Node> children = new ArrayList<Node>();
			children.add(new Node("森林覆盖率"+index_211+"%", null));
			node21.setChildren(children);
			node2child.add(node21);
		}
		String index_221 = goal.getIndex_221();
		if (!StringUtils.isEmpty(index_221)) {
			node22 = new Node();
			node22.setName("促进所有类型森林可持续管理的实施");
			List<Node> children = new ArrayList<Node>();
			children.add(new Node("可持续森林管理覆盖"+index_221+"%", null));
			node22.setChildren(children);
			node2child.add(node22);
		}
		String index_231 = goal.getIndex_231();
		if (!StringUtils.isEmpty(index_231)) {
			node23 = new Node();
			node23.setName("确保山地生态系统的可持续发展");
			List<Node> children = new ArrayList<Node>();
			children.add(new Node("山地绿色覆盖指数"+index_231+"%", null));
			node23.setChildren(children);
			node2child.add(node23);
		}
		node2.setChildren(node2child);
		
		
		
		Node node3 = new Node();
		node3.setName("促进持久、包容性和可持续经济增长、促进实现充分和生产性就业"+goal.getGoal_3()+"%");
		List<Node> node3child = new ArrayList<Node>();
		String index_311 = goal.getIndex_311();
		if (!StringUtils.isEmpty(index_311)) {
			node31 = new Node();
			node31.setName(" 可持续与自然环境相一致的人均经济增长");
			List<Node> children = new ArrayList<Node>();
			children.add(new Node("人均GDP"+index_311+"元", null));
			node31.setChildren(children);
			node3child.add(node31);
		}
		String index_321 = goal.getIndex_321();
		if (!StringUtils.isEmpty(index_321)) {
			node32 = new Node();
			node32.setName(" 得到经济生产力的高水平");
			List<Node> children = new ArrayList<Node>();
			children.add(new Node("就业人口人均GDP增长率"+index_321+"%", null));
			node32.setChildren(children);
			node3child.add(node32);
		}
		String index_331 = goal.getIndex_331();
		String index_332 = goal.getIndex_332();
		if (!StringUtils.isEmpty(index_331) || !StringUtils.isEmpty(index_332)) {
			node33 = new Node();
			node33.setName("实质性降低年轻人就业率");
			List<Node> children = new ArrayList<Node>();
			if (!StringUtils.isEmpty(index_331)) {
				children.add(new Node(" 年轻人（15-24）就业率"+index_331+"%", null));
			}
			if (!StringUtils.isEmpty(index_332)) {
				children.add(new Node("年轻人（15-24）接受教育、培训和就业人口比例"+index_332+"%", null));
			}
			node33.setChildren(children);
			node3child.add(node33);
		}
		String index_341 = goal.getIndex_341();
		String index_342 = goal.getIndex_342();
		if (!StringUtils.isEmpty(index_341) || !StringUtils.isEmpty(index_342)) {
			node34 = new Node();
			node34.setName("促进可持续旅游业发展，创造就业机会和提升当地文化");
			List<Node> children = new ArrayList<Node>();
			if (!StringUtils.isEmpty(index_341)) {
				children.add(new Node(" 旅游业在GDP中的比例"+index_341+"%", null));
			}
			if (!StringUtils.isEmpty(index_342)) {
				children.add(new Node(" 旅游消费（环境压力指数）"+index_342, null));
			}
			node34.setChildren(children);
			node3child.add(node34);
		}
		String index_351 = goal.getIndex_351();
		String index_352 = goal.getIndex_352();
		if (!StringUtils.isEmpty(index_351) || !StringUtils.isEmpty(index_352)) {
			node35 = new Node();
			node35.setName("确保可持续城市化发展和人人参与能力");
			List<Node> children = new ArrayList<Node>();
			if (!StringUtils.isEmpty(index_351)) {
				children.add(new Node("土地利用率"+index_351+"%", null));
			}
			if (!StringUtils.isEmpty(index_352)) {
				children.add(new Node(" 城镇化率"+index_352+"%", null));
			}
			node35.setChildren(children);
			node3child.add(node35);
		}
		String index_361 = goal.getIndex_361();
		if (!StringUtils.isEmpty(index_361)) {
			node36 = new Node();
			node36.setName("社会福利的提高");
			List<Node> children = new ArrayList<Node>();
			children.add(new Node("人均社会福利（查用什么指标衡量）"+index_361+"%", null));
			node36.setChildren(children);
			node3child.add(node36);
		}
		String index_371 = goal.getIndex_371();
		String index_372 = goal.getIndex_372();
		String index_373 = goal.getIndex_373();
		if (!StringUtils.isEmpty(index_371) || !StringUtils.isEmpty(index_372) || !StringUtils.isEmpty(index_373)) {
			node37 = new Node();
			node37.setName("提高农业水生产力");
			List<Node> children = new ArrayList<Node>();
			if (!StringUtils.isEmpty(index_371)) {
				children.add(new Node("提高农业水生产力到"+index_371+"%", null));
			}
			if (!StringUtils.isEmpty(index_372)) {
				children.add(new Node("提高农业水利用效率到"+index_372+"%", null));
			}
			if (!StringUtils.isEmpty(index_373)) {
				children.add(new Node("提高每公顷农产品产值"+index_373+"元", null));
			}
			node37.setChildren(children);
			node3child.add(node37);
		}
		String index_381 = goal.getIndex_381();
		String index_382 = goal.getIndex_382();
		if (!StringUtils.isEmpty(index_381) || !StringUtils.isEmpty(index_382)) {
			node38 = new Node();
			node38.setName("确保可持续粮食生产");
			List<Node> children = new ArrayList<Node>();
			if (!StringUtils.isEmpty(index_381)) {
				children.add(new Node("维持可持续发展的中游耕地面积在"+index_381+"万亩", null));
			}
			if (!StringUtils.isEmpty(index_382)) {
				children.add(new Node("农业温室气体排放"+index_382, null));
			}
			node38.setChildren(children);
			node3child.add(node38);
		}
		node3.setChildren(node3child);
		
		List<Node> rootchildren = new ArrayList<Node>();
		rootchildren.add(node1);
		rootchildren.add(node2);
		rootchildren.add(node3);
		root.setName("目标体系设定");
		root.setChildren(rootchildren);
		return root;
	}

}
