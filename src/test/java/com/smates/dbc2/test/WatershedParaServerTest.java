package com.smates.dbc2.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smates.dbc2.service.WatershedParaService;
import com.smates.dbc2.service.impl.WatershedParaServiceImpl;

public class WatershedParaServerTest {
	
	private static WatershedParaService watershedParaService;
	
	@SuppressWarnings("resource")
	@BeforeClass
	public static void Before(){
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
		watershedParaService = applicationContext.getBean(WatershedParaServiceImpl.class);
	}

	@Test
	public void testaddMidAndDownStreamPercentPara(){
		watershedParaService.addMidAndDownStreamPercentPara("AK003", "001", 5454.3, 65465.3,45.3);
	}
	
	@Test
	public void testaddTbWaterManSceWRPara(){
		watershedParaService.addTbWaterManSceWRPara("AK003", "001", "5454", "6546",45.3);
	}
	
	@Test
	public void testaddSaveWater(){
		watershedParaService.addSaveWater("sdfd", "sdfs", 454.5);
	}
	
}


