package com.smates.dbc2.po;

import java.util.UUID;

/**
 * @author machao march.machao@gmail.com
 * @version 创建时间：2016年9月29日 上午11:00:29
 */
public class TbSocioEconomyScePara {
	private String id;
	private String fldWatershedCode;
	private String fldProjectCode;
	private String fldCountyCode;
	private String fldDate;
	private double fldPerCapGDP;
	private double fldPerCapGDPR;
	private double fldGDP;
	private double fldGDPR;
	private double fldPop;

	public TbSocioEconomyScePara() {
	}

	public TbSocioEconomyScePara(String fldWatershedCode, String fldProjectCode, String fldCountyCode, String fldDate,
			double fldPerCapGDP, double fldPerCapGDPR, double fldGDP, double fldGDPR, double fldPop) {
		this.id = UUID.randomUUID().toString();
		this.fldWatershedCode = fldWatershedCode;
		this.fldProjectCode = fldProjectCode;
		this.fldCountyCode = fldCountyCode;
		this.fldDate = fldDate;
		this.fldPerCapGDP = fldPerCapGDP;
		this.fldPerCapGDPR = fldPerCapGDPR;
		this.fldGDP = fldGDP;
		this.fldGDPR = fldGDPR;
		this.fldPop = fldPop;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFldWatershedCode() {
		return fldWatershedCode;
	}

	public void setFldWatershedCode(String fldWatershedCode) {
		this.fldWatershedCode = fldWatershedCode;
	}

	public String getFldProjectCode() {
		return fldProjectCode;
	}

	public void setFldProjectCode(String fldProjectCode) {
		this.fldProjectCode = fldProjectCode;
	}

	public String getFldCountyCode() {
		return fldCountyCode;
	}

	public void setFldCountyCode(String fldCountyCode) {
		this.fldCountyCode = fldCountyCode;
	}

	public String getFldDate() {
		return fldDate;
	}

	public void setFldDate(String fldDate) {
		this.fldDate = fldDate;
	}

	public double getFldPerCapGDP() {
		return fldPerCapGDP;
	}

	public void setFldPerCapGDP(double fldPerCapGDP) {
		this.fldPerCapGDP = fldPerCapGDP;
	}

	public double getFldPerCapGDPR() {
		return fldPerCapGDPR;
	}

	public void setFldPerCapGDPR(double fldPerCapGDPR) {
		this.fldPerCapGDPR = fldPerCapGDPR;
	}

	public double getFldGDP() {
		return fldGDP;
	}

	public void setFldGDP(double fldGDP) {
		this.fldGDP = fldGDP;
	}

	public double getFldGDPR() {
		return fldGDPR;
	}

	public void setFldGDPR(double fldGDPR) {
		this.fldGDPR = fldGDPR;
	}

	public double getFldPop() {
		return fldPop;
	}

	public void setFldPop(double fldPop) {
		this.fldPop = fldPop;
	}

}
