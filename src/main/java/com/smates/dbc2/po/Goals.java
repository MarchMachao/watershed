package com.smates.dbc2.po;

import java.util.List;

/**
 * 
 * 用于动态加载评价目标的实体
 * 
 * @author March
 *
 */
public class Goals {
	private String goalId;
	private String goalName;
	private String parentId;
	private Integer order;
	private Integer value;
	private String englishName;
	private List<Goals> subGoals;

	public Goals() {
	}

	public Goals(String goalId, String goalName, String parentId, Integer order, Integer value, String englishName,
			List<Goals> subGoals) {
		this.goalId = goalId;
		this.goalName = goalName;
		this.parentId = parentId;
		this.order = order;
		this.value = value;
		this.englishName = englishName;
		this.subGoals = subGoals;
	}

	public String getGoalId() {
		return goalId;
	}

	public void setGoalId(String goalId) {
		this.goalId = goalId;
	}

	public String getGoalName() {
		return goalName;
	}

	public void setGoalName(String goalName) {
		this.goalName = goalName;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public List<Goals> getSubGoals() {
		return subGoals;
	}

	public void setSubGoals(List<Goals> subGoals) {
		this.subGoals = subGoals;
	}

}
