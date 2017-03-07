package com.smates.dbc2.service;

/**
 * 获取用户语言业务接口
 * 
 * @author baijw
 * 
 * @date 2017年3月7日 上午10:48:17
 */
public interface UserAndLanguageService {

	/**
	 * 获取用户使用的语言
	 * 
	 * @param accountNumber
	 * 
	 * @return
	 */
	public String getUserAndLanuage(String accountNumber);

}
