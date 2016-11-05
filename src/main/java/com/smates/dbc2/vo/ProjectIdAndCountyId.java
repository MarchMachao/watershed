package com.smates.dbc2.vo;

/**
 * 气候情景主键
 * @author baijw
 *
 */
public class ProjectIdAndCountyId {
	private String projectId;
	private String countryId;
	private String year;

	public ProjectIdAndCountyId(String projectId, String countryId,String year) {
		this.projectId = projectId;
		this.countryId = countryId;
		this.year = year;
	}

	public ProjectIdAndCountyId() {
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

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
