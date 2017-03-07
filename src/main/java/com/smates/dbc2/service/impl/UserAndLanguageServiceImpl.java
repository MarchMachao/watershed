package com.smates.dbc2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smates.dbc2.mapper.UserAndLanguageDao;
import com.smates.dbc2.service.UserAndLanguageService;

@Service
public class UserAndLanguageServiceImpl implements UserAndLanguageService{
	
	@Autowired
	private UserAndLanguageDao userAndLanguageDao;

	@Override
	public String getUserAndLanuage(String accountNumber) {
		return userAndLanguageDao.getUserAndLanuageByAccountNumber(accountNumber).getLanguage();
	}

}
