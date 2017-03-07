package com.smates.dbc2.mapper;

import com.smates.dbc2.po.UserAndLanuage;

/**
 * 用户和语言的对应关系
 * @author baijw
 * 
 * @date 2017年3月7日 上午10:43:37
 */
public interface UserAndLanguageDao {

	/**
	 * 获取用户使用的语言
	 * 
	 * @param accountNumber
	 * 
	 * @return
	 */
	public UserAndLanuage getUserAndLanuageByAccountNumber(String accountNumber);
	
}
