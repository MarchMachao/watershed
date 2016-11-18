package com.smates.dbc2.po;

/**
 * 气候情景参数
 * 
 * @author machao march.machao@gmail.com
 * @version 创建时间：2016年9月29日 上午10:31:13
 */
public class TblClimateScePara extends BaseClass{

	private String projectId;
	private String countryId;
	private String rainInc;
	private String tempInc;
	private String year;
	private String fldCRPType;

	public TblClimateScePara() {
	}

	public TblClimateScePara(String projectId, String countryId, String rainInc, String tempInc, String year,
			String fldCRPType) {
		this.projectId = projectId;
		this.countryId = countryId;
		this.rainInc = rainInc;
		this.tempInc = tempInc;
		this.year = year;
		this.fldCRPType = fldCRPType;
	}

	public String getFldCRPType() {
		return fldCRPType;
	}

	public void setFldCRPType(String fldCRPType) {
		this.fldCRPType = fldCRPType;
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

	public String getRainInc() {
		return rainInc;
	}

	public void setRainInc(String rainInc) {
		this.rainInc = rainInc;
	}

	public String getTempInc() {
		return tempInc;
	}

	public void setTempInc(String tempInc) {
		this.tempInc = tempInc;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
}
