package com.smates.dbc2.vo;

/**
 * 气候情景参数vo，用来按IPCC和县区查找气候数据
 * 
 * @author baijw
 *
 */
public class CRPTypeAndCountryId {

	private String fldCRPType;
	private String countryId;

	public CRPTypeAndCountryId(String fldCRPType, String countryId) {
		super();
		this.fldCRPType = fldCRPType;
		this.countryId = countryId;
	}

	public String getFldCRPType() {
		return fldCRPType;
	}

	public void setFldCRPType(String fldCRPType) {
		this.fldCRPType = fldCRPType;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

}
