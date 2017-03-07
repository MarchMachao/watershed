package com.smates.dbc2.po;

/**
 * 用户默认语言po
 * 
 * @author baijw
 *
 */
public class UserAndLanuage {   

	private String acountNumber;    
	private String lanuage;

	public UserAndLanuage() {
		super();
	}

	public UserAndLanuage(String acountNumber, String lanuage) {
		super();
		this.acountNumber = acountNumber;
		this.lanuage = lanuage;
	}

	public String getAcountNumber() {
		return acountNumber;
	}

	public void setAcountNumber(String acountNumber) {
		this.acountNumber = acountNumber;
	}

	public String getLanuage() {
		return lanuage;
	}

	public void setLanuage(String lanuage) {
		this.lanuage = lanuage;
	}

}
