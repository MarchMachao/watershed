package com.smates.dbc2.vo;

/**
 * 流域查询条件
 * 
 * @author baijw
 *
 */
public class WatershedParaVo {
	private String name;
	private int rows;
	private int startNum;

	public WatershedParaVo() {
	}

	public WatershedParaVo(String name, int rows, int startNum) {
		this.name = name;
		this.rows = rows;
		this.startNum = startNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

}
