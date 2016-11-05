package com.smates.dbc2.test;

import java.lang.reflect.InvocationTargetException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smates.dbc2.controller.ModelController;

public class ModelControllerTest {
	
	private static ModelController modelController;
	
	@SuppressWarnings("resource")
	@BeforeClass
	public static void Before(){
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
		modelController = applicationContext.getBean(ModelController.class);
	}

	@Test
	public void testaddMidAndDownStreamPercentPara() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		modelController.test("3ec75f9d-a1aa-4455-a753-e8fc50f188c8");
	}
	
}


