package com.smates.dbc2.po;

/**
 * gis评价结果的图表
 * 
 * @author machao
 *
 */
public class Gisecharts {
	private String year;
	private String resultOverall;
	private String resultP1;
	private String resultP2;
	private String resultP3;

	public Gisecharts() {
	}

	public Gisecharts(String resultOverall, String resultP1, String resultP2, String resultP3) {
		super();
		this.resultOverall = resultOverall;
		this.resultP1 = resultP1;
		this.resultP2 = resultP2;
		this.resultP3 = resultP3;
	}

	public Gisecharts(String year, String resultOverall, String resultP1, String resultP2, String resultP3) {
		this.year = year;
		this.resultOverall = resultOverall;
		this.resultP1 = resultP1;
		this.resultP2 = resultP2;
		this.resultP3 = resultP3;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getResultOverall() {
		return resultOverall;
	}

	public void setResultOverall(String resultOverall) {
		this.resultOverall = resultOverall;
	}

	public String getResultP1() {
		return resultP1;
	}

	public void setResultP1(String resultP1) {
		this.resultP1 = resultP1;
	}

	public String getResultP2() {
		return resultP2;
	}

	public void setResultP2(String resultP2) {
		this.resultP2 = resultP2;
	}

	public String getResultP3() {
		return resultP3;
	}

	public void setResultP3(String resultP3) {
		this.resultP3 = resultP3;
	}

}
