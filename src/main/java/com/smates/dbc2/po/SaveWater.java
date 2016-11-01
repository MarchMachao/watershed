package com.smates.dbc2.po;

/**
 * 节水技术
 * 
 * @author baijw
 *
 */
public class SaveWater {

	private String projectId;
	private String countryId;
	private double savewater;

	public SaveWater() {
	}

	public SaveWater(String projectId, String countryId, double savewater) {
		this.projectId = projectId;
		this.countryId = countryId;
		this.savewater = savewater;
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

	public double getSavewater() {
		return savewater;
	}

	public void setSavewater(double savewater) {
		this.savewater = savewater;
	}

}
