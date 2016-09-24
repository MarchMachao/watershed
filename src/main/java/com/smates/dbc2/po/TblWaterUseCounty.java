package com.smates.dbc2.po;

/**
 * 县区三产用水量
 * 
 * @author baijw
 *
 */
public class TblWaterUseCounty {

	private String id;
	private String fldWatershedCode;
	private String fldCountyCode;
	private String fldDate;
	private double fldWaterUseAgr;
	private double fldWaterUseInd;
	private double fldWaterUseSer;

	public TblWaterUseCounty() {
	}

	public TblWaterUseCounty(String id, String fldWatershedCode, String fldCountyCode, String fldDate,
			double fldWaterUseAgr, double fldWaterUseInd, double fldWaterUseSer) {
		this.id = id;
		this.fldWatershedCode = fldWatershedCode;
		this.fldCountyCode = fldCountyCode;
		this.fldDate = fldDate;
		this.fldWaterUseAgr = fldWaterUseAgr;
		this.fldWaterUseInd = fldWaterUseInd;
		this.fldWaterUseSer = fldWaterUseSer;
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

	public double getFldWaterUseAgr() {
		return fldWaterUseAgr;
	}

	public void setFldWaterUseAgr(double fldWaterUseAgr) {
		this.fldWaterUseAgr = fldWaterUseAgr;
	}

	public double getFldWaterUseInd() {
		return fldWaterUseInd;
	}

	public void setFldWaterUseInd(double fldWaterUseInd) {
		this.fldWaterUseInd = fldWaterUseInd;
	}

	public double getFldWaterUseSer() {
		return fldWaterUseSer;
	}

	public void setFldWaterUseSer(double fldWaterUseSer) {
		this.fldWaterUseSer = fldWaterUseSer;
	}

}
