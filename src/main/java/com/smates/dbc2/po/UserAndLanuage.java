package com.smates.dbc2.po;

/**
 * 用户默认语言po
 * 
 * @author baijw
 *
 */
public class UserAndLanuage {

	private String accountNumber;
	private String language;

	public UserAndLanuage() {
	}

	public UserAndLanuage(String accountNumber, String language) {
		this.accountNumber = accountNumber;
		this.language = language;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
