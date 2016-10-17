package com.smates.dbc2.po;

/**
 * 产业与城市发展情景参数
 * 
 * @author machao march.machao@gmail.com
 * @version 创建时间：2016年9月29日 上午10:36:41
 */
public class TblIndUrbanScePara extends BaseClass{

	private String projectId;
	private String countryId;
	private String nonFarmPercent;
	private String fldIndOutput;
	private String fldIndOutputPercent;
	private String fldAgrOutput;
	private String fldAgrOutputPercent;
	private String fldSerOutput;
	private String fldSerOutputPercent;
	private String industryProgressRate;
	private String changeRateOfTourismIndustry;

	public TblIndUrbanScePara() {
	}

	public TblIndUrbanScePara(String projectId, String countryId, String nonFarmPercent, String fldIndOutput,
			String fldIndOutputPercent, String fldAgrOutput, String fldAgrOutputPercent, String fldSerOutput,
			String fldSerOutputPercent, String industryProgressRate, String changeRateOfTourismIndustry) {
		this.projectId = projectId;
		this.countryId = countryId;
		this.nonFarmPercent = nonFarmPercent;
		this.fldIndOutput = fldIndOutput;
		this.fldIndOutputPercent = fldIndOutputPercent;
		this.fldAgrOutput = fldAgrOutput;
		this.fldAgrOutputPercent = fldAgrOutputPercent;
		this.fldSerOutput = fldSerOutput;
		this.fldSerOutputPercent = fldSerOutputPercent;
		this.industryProgressRate = industryProgressRate;
		this.changeRateOfTourismIndustry = changeRateOfTourismIndustry;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getNonFarmPercent() {
		return nonFarmPercent;
	}

	public void setNonFarmPercent(String nonFarmPercent) {
		this.nonFarmPercent = nonFarmPercent;
	}

	public String getFldIndOutput() {
		return fldIndOutput;
	}

	public void setFldIndOutput(String fldIndOutput) {
		this.fldIndOutput = fldIndOutput;
	}

	public String getFldIndOutputPercent() {
		return fldIndOutputPercent;
	}

	public void setFldIndOutputPercent(String fldIndOutputPercent) {
		this.fldIndOutputPercent = fldIndOutputPercent;
	}

	public String getFldAgrOutput() {
		return fldAgrOutput;
	}

	public void setFldAgrOutput(String fldAgrOutput) {
		this.fldAgrOutput = fldAgrOutput;
	}

	public String getFldAgrOutputPercent() {
		return fldAgrOutputPercent;
	}

	public void setFldAgrOutputPercent(String fldAgrOutputPercent) {
		this.fldAgrOutputPercent = fldAgrOutputPercent;
	}

	public String getFldSerOutput() {
		return fldSerOutput;
	}

	public void setFldSerOutput(String fldSerOutput) {
		this.fldSerOutput = fldSerOutput;
	}

	public String getFldSerOutputPercent() {
		return fldSerOutputPercent;
	}

	public void setFldSerOutputPercent(String fldSerOutputPercent) {
		this.fldSerOutputPercent = fldSerOutputPercent;
	}

	public String getIndustryProgressRate() {
		return industryProgressRate;
	}

	public void setIndustryProgressRate(String industryProgressRate) {
		this.industryProgressRate = industryProgressRate;
	}

	public String getChangeRateOfTourismIndustry() {
		return changeRateOfTourismIndustry;
	}

	public void setChangeRateOfTourismIndustry(String changeRateOfTourismIndustry) {
		this.changeRateOfTourismIndustry = changeRateOfTourismIndustry;
	}

}
