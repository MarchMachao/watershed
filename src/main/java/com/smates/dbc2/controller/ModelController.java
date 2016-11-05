package com.smates.dbc2.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smates.dbc2.service.GetWebServiceParaService;
import com.smates.dbc2.ws.DoubleArray;

@Controller
public class ModelController {

	@Autowired
	private GetWebServiceParaService getWebServiceParaService;

	@RequestMapping("test")
	public String test(String projectId) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
//			String watershedCode = "AKH13002"; //流域id
//			List<String> countyCodes = getWebServiceParaService.getCountryCodes();//县区代码
//			List<String> countyNames = getWebServiceParaService.getCountryNames();//县区名字
//			String timeStart = getWebServiceParaService.getProjectById(projectId).getBaseYear();//开始时间
//	        String timeEnd = getWebServiceParaService.getProjectById(projectId).getGoalYear();//结束时间
//	        int timeStep = Integer.parseInt(getWebServiceParaService.getProjectById(projectId).getStep());//步长
	        List<DoubleArray> prec = getWebServiceParaService.getTblClimateScenarioYear();//降水量
//	        List<DoubleArray> precR = getWebServiceParaService.getprecR(projectId);
	        
	        System.out.println(prec.size());
	        
		return "home.ftl";
	}
	
}
