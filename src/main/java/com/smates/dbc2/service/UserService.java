package com.smates.dbc2.service;

import com.smates.dbc2.po.User;

/**
 * 用户相关service
 * 
 * @author baijw12
 *
 */
public interface UserService {

	/**
	 * 获取当前登录的用户
	 * 
	 * @return
	 */
	public String getCurrentUserId();

	/**
	 * 根据accountNumber查找user
	 * 
	 * @param accountNumber
	 * @return
	 */
	public User getUserByAccountNumber(String accountNumber);

}
