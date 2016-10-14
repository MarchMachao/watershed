package com.smates.dbc2.po;

/**
 * 气候情景参数
 * 
 * @author machao march.machao@gmail.com
 * @version 创建时间：2016年9月29日 上午10:31:13
 */
public class TblClimateScePara {

	private String projectId;
	private String countryId;
	private String rainInc;
	private String tempInc;

	public TblClimateScePara(String projectId, String countryId, String rainInc, String tempInc) {
		this.projectId = projectId;
		this.countryId = countryId;
		this.rainInc = rainInc;
		this.tempInc = tempInc;
	}

	public TblClimateScePara() {
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

}
