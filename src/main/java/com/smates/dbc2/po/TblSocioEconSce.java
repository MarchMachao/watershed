package com.smates.dbc2.po;

import java.util.UUID;

/**
 * GDP发展表
 * 
 * @author machao
 *
 */
public class TblSocioEconSce {
	
	private String id;
	private String fldWatershedCode;
	private String fldCountyCode;
	private String fldDate;
	private double fldPerCapGDP;
	private double fldGDP;
	private double fldPop;
	
	public TblSocioEconSce() {
	}

	public TblSocioEconSce(String fldWatershedCode, String fldCountyCode, String fldDate,
			double fldPerCapGDP, double fldGDP, double fldPop) {
		this.id = UUID.randomUUID().toString();
		this.fldWatershedCode = fldWatershedCode;
		this.fldCountyCode = fldCountyCode;
		this.fldDate = fldDate;
		this.fldPerCapGDP = fldPerCapGDP;
		this.fldGDP = fldGDP;
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

	public double getFldGDP() {
		return fldGDP;
	}

	public void setFldGDP(double fldGDP) {
		this.fldGDP = fldGDP;
	}

	public double getFldPop() {
		return fldPop;
	}

	public void setFldPop(double fldPop) {
		this.fldPop = fldPop;
	}
	
}
