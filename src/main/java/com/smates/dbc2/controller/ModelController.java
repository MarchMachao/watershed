package com.smates.dbc2.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smates.dbc2.service.GetWebServiceParaService;
import com.smates.dbc2.ws.DoubleArray;
import com.smates.dbc2.ws.RisDSSModelService;
import com.smates.dbc2.ws.RisDSSModelServiceImplService;

@Controller
public class ModelController {

	@Autowired
	private GetWebServiceParaService getWebServiceParaService;

	private RisDSSModelService risDSSModelService = new RisDSSModelServiceImplService().getRisDSSModelServiceImplPort();
	
	@ResponseBody
	@RequestMapping(value="test", method = RequestMethod.POST)
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

		// 社会经济发展情景
		List<DoubleArray> gdp = getWebServiceParaService.getGDP(); // GDP
		List<DoubleArray> gdpPer = getWebServiceParaService.getgdpPer();// 人均GDP
		List<DoubleArray> gdpR = getWebServiceParaService.getGDPInc(projectId);// GDP增长率
		List<DoubleArray> gdpPerR = getWebServiceParaService.getGDPperInc(projectId);// 人均GDP增长率
		// double policyPop [][], //人口政策， 1-一胎政策；2-二胎政策；3-全面二胎政策
		List<DoubleArray> channelMain = getWebServiceParaService.getchannelMain(projectId); // 干渠长度
		List<DoubleArray> channelBran = getWebServiceParaService.getchannelBran(projectId);// 支渠长度
		List<DoubleArray> channelDou = getWebServiceParaService.getchannelDou(projectId);// 斗渠长度
		List<DoubleArray> channelNong = getWebServiceParaService.getchannelNong(projectId);// 农渠长度
		List<DoubleArray> channelMao = getWebServiceParaService.getchannelMao(projectId);// 毛渠长度
		List<DoubleArray> channelMainWUE = getWebServiceParaService.getchannelMainWUE(projectId); // 干渠水利用率
		List<DoubleArray> channelBranWUE = getWebServiceParaService.getchannelBranWUE(projectId); // 支渠水利用率
		List<DoubleArray> channelDouWUE = getWebServiceParaService.getchannelDouWUE(projectId); // 斗渠水利用率
		List<DoubleArray> channelNongWUE = getWebServiceParaService.getchannelNongWUE(projectId); // 农渠水利用率
		List<DoubleArray> channelMaoWUE = getWebServiceParaService.getchannelMaoWUE(projectId);// 毛渠水利用率
		// double channelMainWUER [][], //干渠水利用率变化率
		// double channelBranWUER [][], //支渠水利用率变化率
		// double channelDouWUER [][], //斗渠水利用率变化率
		// double channelNongWUER [][], //农渠水利用率变化率
		// double channelMaoWUER [][], //毛渠水利用率变化率
		List<DoubleArray> areaDripIrri = getWebServiceParaService.getareaDripIrri(projectId); //滴灌面积（有中游滴灌面积和县区滴灌面积）
		List<DoubleArray> allowanceInd = getWebServiceParaService.getallowanceInd(projectId); //工业政策补贴
		List<DoubleArray> allowanceAgr = getWebServiceParaService.getallowanceAgr(projectId); //农业政策补贴
		List<DoubleArray> allowanceSer = getWebServiceParaService.getallowanceSer(projectId); //服务业政策补贴

		//产业与城市发展参数
		//		@WebParam(name = "pop") double pop [][], //人口
//        @WebParam(name = "popR") double popR [][], //人口增长率
//        @WebParam(name = "popAgriR") double popAgriR [][], //农业人口比例
//        @WebParam(name = "popAgriRR") double popAgriRR [][], //农业人口比例变化率
//        @WebParam(name = "popNonAgriR") double popNonAgriR [][], //非农业人口比例
		List<DoubleArray> popNonAgriRR = getWebServiceParaService.getpopNonAgriRR(projectId);//非农业人口变化率
		List<DoubleArray> outputInd = getWebServiceParaService.getoutputInd();//工业产值
		List<DoubleArray> outputAgr = getWebServiceParaService.getoutputAgr();//农业产值
		List<DoubleArray> outputSer = getWebServiceParaService.getoutputSer();//服务业产值
		List<DoubleArray> outputTour = getWebServiceParaService.getoutputTour();//旅游业产值
//                         @WebParam(name = "outputIndR") double outputIndR [][], //工业产值变化率
//                         @WebParam(name = "outputAgrR") double outputAgrR [][], //农业产值变化率
//                         @WebParam(name = "outputSerR") double outputSerR [][], //服务业产值变化率
		List<DoubleArray> outputTourR = getWebServiceParaService.getoutputTourR(projectId);//旅游业产值变化率
		List<DoubleArray> techProgRR = getWebServiceParaService.gettechProgRR(projectId);//产业进步率变化率
		
		//土地利用情景
		List<DoubleArray> areaAgri = getWebServiceParaService.getareaAgri(projectId);//耕地面积
		List<DoubleArray> areaAgriR = getWebServiceParaService.getareaAgriR(projectId);//耕地面积变化率
		List<DoubleArray> areaCropWheat = getWebServiceParaService.getareaCropWheat(projectId);//作物小麦种植面积
		List<DoubleArray> areaCropCorn = getWebServiceParaService.getareaCropCorn(projectId);//作物玉米种植面积
		List<DoubleArray> areaCropOilseed = getWebServiceParaService.getareaCropOilseed(projectId); //作物油料种植面积
		List<DoubleArray> areaCropOrchard = getWebServiceParaService.getareaCropOrchard(projectId);//作物果园种植面积
		List<DoubleArray> areaCropCotton = getWebServiceParaService.getareaCropCotton(projectId);//作物棉花种植面积
		List<DoubleArray> areaCropGreenstuff = getWebServiceParaService.getareaCropGreenstuff (projectId);//作物蔬菜种植面积
		List<DoubleArray> areaCropWheatR = getWebServiceParaService.getareaCropWheatR(projectId);//作物小麦种植面积变化率
		List<DoubleArray> areaCropCornR = getWebServiceParaService.getareaCropCornR(projectId);//作物玉米种植面积变化率
		List<DoubleArray> areaCropOilseedR = getWebServiceParaService.getareaCropOilseedR(projectId);//作物油料种植面积变化率
		List<DoubleArray> areaCropOrchardR = getWebServiceParaService.getareaCropOrchardR(projectId);//作物果园种植面积变化率
		List<DoubleArray> areaCropCottonR = getWebServiceParaService.getareaCropCottonR(projectId);//作物棉花种植面积变化率
		List<DoubleArray> areaCropGreenstuffR = getWebServiceParaService.getareaCropGreenstuffR(projectId);//作物蔬菜种植面积变化率
		List<DoubleArray> areaWetland = getWebServiceParaService.getareaWetland(projectId);//湿地面积
		List<DoubleArray> areaForest = getWebServiceParaService.getareaForest(projectId);//林地面积
		List<DoubleArray> areaGrass = getWebServiceParaService.getareaGrass(projectId);//草地面积
		List<DoubleArray> areaWater = getWebServiceParaService.getareaWater(projectId);//水域面积
//     	@WebParam(name = "areaWetlandR") double areaWetlandR [][], //湿地面积
//        @WebParam(name = "areaForestR") double areaForestR [][], //林地面积变化率
//        @WebParam(name = "areaGrassR") double areaGrassR [][], //草地面积变化率
//        @WebParam(name = "areaWaterR") double areaWaterR [][], //水域面积变化率
		
		

		

		// 水资源管理情景
		List<DoubleArray> waterAlloMid = getWebServiceParaService.getTblMidDownWaterAllo(); // 中游分水量，没有countryId属性的
		List<DoubleArray> waterAlloDown = getWebServiceParaService.getTblDownDownWaterAllo(); // 下游分水量
		List<DoubleArray> waterRight = getWebServiceParaService.getfldWaterRightRatio(projectId); // 水权分配比例
		List<DoubleArray> waterSavingTechR = getWebServiceParaService.getSaveWater(projectId); // 节水技术提高比率
		
//		 System.out.println(allowanceSer.size());
//		 System.out.println(waterAlloMid.size());
//		 System.out.println(waterAlloDown.size());
//		 System.out.println(waterRight.size());

		return risDSSModelService.start(watershedCode, countyCodes, countyNames, timeStart, timeEnd, timeStep, prec,
				precR, tempAvg, tempMax, tempMin, outputInd, outputAgr, outputSer, outputTour, outputTourR, techProgRR,
				areaAgri, areaAgriR, areaCropWheat, areaCropCorn, areaCropOilseed, areaCropOrchard, areaCropCotton,
				areaCropGreenstuff, areaCropWheatR, areaCropCornR, areaCropOilseedR, areaCropOrchardR, areaCropCottonR,
				areaCropGreenstuffR, areaForest, areaGrass, areaWater, gdp, gdpPer, gdpR, gdpPerR, channelMain,
				channelBran, channelDou, channelNong, channelMao, channelMainWUE, channelBranWUE, channelDouWUE,
				channelNongWUE, channelMaoWUE, areaDripIrri, allowanceInd, allowanceAgr, allowanceSer, waterAlloMid,
				waterAlloDown, waterRight, waterSavingTechR);
	}

	@ResponseBody
	@RequestMapping(value = ("getDataYearlyws"), method = RequestMethod.POST)
	public String getDataYearlyws(long year) {
		try {
			List<DoubleArray> E = risDSSModelService.getDataYearly("AKH13002", year);
		} catch (Exception e) {
			return "数据返回错误，请检查";
		}
		return "数据已提交给指标计算模型！";
	}

	@ResponseBody
	@RequestMapping(value = ("queryAvailablews"), method = RequestMethod.POST)
	public List<Integer> queryAvailablews() {

		return risDSSModelService.queryAvailable();
	}

	@ResponseBody
	@RequestMapping(value = ("queryStatews"), method = RequestMethod.POST)
	public int queryStatews() {
		return risDSSModelService.queryState();
	}

}
