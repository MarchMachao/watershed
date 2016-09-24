package com.smates.dbc2.po;

import java.util.UUID;

/**
 * 优惠政策表
 * 
 * @author machao
 *
 */

public class TblPrefPolicy {

	private String id;
	private String fldWatershedCode;
	private String fldCountyCode;
	private String fldDate;
	private String fldPrefPolicyType;
	private double fldAllowance;

	public TblPrefPolicy() {
	}

	public TblPrefPolicy(String fldWatershedCode, String fldCountyCode, String fldDate, String fldPrefPolicyType,
			double fldAllowance) {
		this.id = UUID.randomUUID().toString();
		this.fldWatershedCode = fldWatershedCode;
		this.fldCountyCode = fldCountyCode;
		this.fldDate = fldDate;
		this.fldPrefPolicyType = fldPrefPolicyType;
		this.fldAllowance = fldAllowance;
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

	public String getFldPrefPolicyType() {
		return fldPrefPolicyType;
	}

	public void setFldPrefPolicyType(String fldPrefPolicyType) {
		this.fldPrefPolicyType = fldPrefPolicyType;
	}

	public double getFldAllowance() {
		return fldAllowance;
	}

	public void setFldAllowance(double fldAllowance) {
		this.fldAllowance = fldAllowance;
	}

}
