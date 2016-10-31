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
	public void testaddTbWaterManSceCWPara(){
		watershedParaService.addTbWaterManSceCWPara("AK003", "001", "54822", "1199", 5454, 65465);
	}
	
	@Test
	public void testaddTbWaterManSceMDPara(){
		watershedParaService.addTbWaterManSceMDPara("AK003", "001", "54822", "1199", 5454, 65465);
	}
	
	@Test
	public void testaddtbWaterManSceWRPara(){
		watershedParaService.addTbWaterManSceWRPara("AK003", "001", "54822", "1199", 54);
	}
	
}


