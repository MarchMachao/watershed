package com.smates.dbc2.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smates.dbc2.po.User;
import com.smates.dbc2.service.impl.UserServiceImpl;

public class UserServerTest {
	
	private static UserServiceImpl userServiceImpl;
	
	@SuppressWarnings("resource")
	@BeforeClass
	public static void Before(){
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
		userServiceImpl = applicationContext.getBean(UserServiceImpl.class);
	}

	@Test
	public void testCreateUser(){
		User user = userServiceImpl.getUserByAccountNumber("admin");
		System.out.println(user);
	}
	
}


