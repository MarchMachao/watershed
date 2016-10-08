package com.smates.dbc2.po;

import java.util.UUID;

/**
 * @author machao march.machao@gmail.com
 * @version 创建时间：2016年9月29日 上午10:31:13
 */
public class TblClimateScePara {

	private String id;
	private String fldWatershedCode;
	private String fldProjectCode;
	private String fldCountyCode;
	private String fldCRPType;
	private String fldDate;
	private double fldPrecipitation;
	private double fldAvgTemperature;
	private double fldMaxTemp;
	private double fldMinTemp;

	public TblClimateScePara() {
	}

	public TblClimateScePara(String fldWatershedCode, String fldProjectCode, String fldCountyCode,
			String fldCRPType, String fldDate, double fldPrecipitation, double fldAvgTemperature, double fldMaxTemp,
			double fldMinTemp) {
		this.id = UUID.randomUUID().toString();
		this.fldWatershedCode = fldWatershedCode;
		this.fldProjectCode = fldProjectCode;
		this.fldCountyCode = fldCountyCode;
		this.fldCRPType = fldCRPType;
		this.fldDate = fldDate;
		this.fldPrecipitation = fldPrecipitation;
		this.fldAvgTemperature = fldAvgTemperature;
		this.fldMaxTemp = fldMaxTemp;
		this.fldMinTemp = fldMinTemp;
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

	public String getFldCRPType() {
		return fldCRPType;
	}

	public void setFldCRPType(String fldCRPType) {
		this.fldCRPType = fldCRPType;
	}

	public String getFldDate() {
		return fldDate;
	}

	public void setFldDate(String fldDate) {
		this.fldDate = fldDate;
	}

	public double getFldPrecipitation() {
		return fldPrecipitation;
	}

	public void setFldPrecipitation(double fldPrecipitation) {
		this.fldPrecipitation = fldPrecipitation;
	}

	public double getFldAvgTemperature() {
		return fldAvgTemperature;
	}

	public void setFldAvgTemperature(double fldAvgTemperature) {
		this.fldAvgTemperature = fldAvgTemperature;
	}

	public double getFldMaxTemp() {
		return fldMaxTemp;
	}

	public void setFldMaxTemp(double fldMaxTemp) {
		this.fldMaxTemp = fldMaxTemp;
	}

	public double getFldMinTemp() {
		return fldMinTemp;
	}

	public void setFldMinTemp(double fldMinTemp) {
		this.fldMinTemp = fldMinTemp;
	}

}
