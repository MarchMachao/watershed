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
	public String test(String projectId)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 模型控制信息
		String watershedCode = "AKH13002"; // 流域id
		List<String> countyCodes = getWebServiceParaService.getCountryCodes();// 县区代码
		List<String> countyNames = getWebServiceParaService.getCountryNames();// 县区名字
		String timeStart = getWebServiceParaService.getProjectById(projectId).getBaseYear();// 开始时间
		String timeEnd = getWebServiceParaService.getProjectById(projectId).getGoalYear();// 结束时间
		int timeStep = Integer.parseInt(getWebServiceParaService.getProjectById(projectId).getStep());// 步长

		// 气候变化情景
		List<DoubleArray> prec = getWebServiceParaService.getTblClimateScenarioYear();// 降水量
		List<DoubleArray> precR = getWebServiceParaService.getprecR(projectId);// 降雨增加比率
		List<DoubleArray> tempAvg = getWebServiceParaService.gettempAvg();// 平均温度
		List<DoubleArray> tempMax = getWebServiceParaService.gettempMax();// 最高温度
		List<DoubleArray> tempMin = getWebServiceParaService.gettempMin();// 最低温度
		// @WebParam(name = "tempAvgR") double tempAvgR [][], //平均温度变化率
		// @WebParam(name = "tempMaxR") double tempMaxR [][], //最高温度变化率
		// @WebParam(name = "tempMinR") double tempMinR [][], //最低温度变化率

		// 产业与城市发展情景
		
		
		 //社会经济发展情景
		   List<DoubleArray> gdp = getWebServiceParaService.getGDP(); //GDP
		   List<DoubleArray> gdpPer = getWebServiceParaService.getgdpPer();//人均GDP
		   List<DoubleArray> gdpR = getWebServiceParaService.getGDPInc(projectId);//GDP增长率
		   List<DoubleArray> gdpPerR = getWebServiceParaService.getGDPperInc(projectId);//人均GDP增长率
//         double policyPop [][], //人口政策， 1-一胎政策；2-二胎政策；3-全面二胎政策
		   List<DoubleArray> channelMain = getWebServiceParaService.getchannelMain(projectId); //干渠长度
		   List<DoubleArray> channelBran = getWebServiceParaService.getchannelBran(projectId);//支渠长度
		   List<DoubleArray> channelDou = getWebServiceParaService.getchannelDou(projectId);//斗渠长度
		   List<DoubleArray> channelNong = getWebServiceParaService.getchannelNong(projectId);//农渠长度
		   List<DoubleArray> channelMao = getWebServiceParaService.getchannelMao(projectId);//毛渠长度
//         double channelMainWUE [][], //干渠水利用率
//         double channelBranWUE [][], //支渠水利用率
//         double channelDouWUE [][], //斗渠水利用率
//         double channelNongWUE [][], //农渠水利用率
//         double channelMaoWUE [][], //毛渠水利用率
//         double channelMainWUER [][], //干渠水利用率变化率
//         double channelBranWUER [][], //支渠水利用率变化率
//         double channelDouWUER [][], //斗渠水利用率变化率
//         double channelNongWUER [][], //农渠水利用率变化率
//         double channelMaoWUER [][], //毛渠水利用率变化率
//         double areaDripIrri [][], //滴灌面积（有中游滴灌面积和县区滴灌面积）
//         double allowanceInd [][], //工业政策补贴
//         double allowanceAgr [][], //农业政策补贴
//         double allowanceSer [][], //服务业政策补贴
		

		// 水资源管理情景
		List<DoubleArray> waterAlloMid = getWebServiceParaService.getTblMidDownWaterAllo(); // 中游分水量，没有countryId属性的
		List<DoubleArray> waterAlloDown = getWebServiceParaService.getTblDownDownWaterAllo(); // 下游分水量
		List<DoubleArray> waterRight = getWebServiceParaService.getfldWaterRightRatio(projectId); // 水权分配比例
		List<DoubleArray> waterSavingTechR = getWebServiceParaService.getSaveWater(projectId); // 节水技术提高比率
		
		 System.out.println(channelBran.size());

		return "home.ftl";
	}

}
