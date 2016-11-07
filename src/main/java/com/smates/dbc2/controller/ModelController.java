package com.smates.dbc2.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smates.dbc2.service.GetWebServiceParaService;
import com.smates.dbc2.service.IndexCalculateService;
import com.smates.dbc2.ws.DoubleArray;
import com.smates.dbc2.ws.RisDSSModelService;
import com.smates.dbc2.ws.RisDSSModelServiceImplService;

@Controller
public class ModelController {

	@Autowired
	private GetWebServiceParaService getWebServiceParaService;

	@Autowired
	private IndexCalculateService indexCalculateService;

	private RisDSSModelService risDSSModelService = new RisDSSModelServiceImplService().getRisDSSModelServiceImplPort();

	@ResponseBody
	@RequestMapping(value = "test", method = RequestMethod.POST)
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
		List<DoubleArray> areaDripIrri = getWebServiceParaService.getareaDripIrri(projectId); // 滴灌面积（有中游滴灌面积和县区滴灌面积）
		List<DoubleArray> allowanceInd = getWebServiceParaService.getallowanceInd(projectId); // 工业政策补贴
		List<DoubleArray> allowanceAgr = getWebServiceParaService.getallowanceAgr(projectId); // 农业政策补贴
		List<DoubleArray> allowanceSer = getWebServiceParaService.getallowanceSer(projectId); // 服务业政策补贴

		// 产业与城市发展参数
		// @WebParam(name = "pop") double pop [][], //人口
		// @WebParam(name = "popR") double popR [][], //人口增长率
		// @WebParam(name = "popAgriR") double popAgriR [][], //农业人口比例
		// @WebParam(name = "popAgriRR") double popAgriRR [][], //农业人口比例变化率
		// @WebParam(name = "popNonAgriR") double popNonAgriR [][], //非农业人口比例
		List<DoubleArray> popNonAgriRR = getWebServiceParaService.getpopNonAgriRR(projectId);// 非农业人口变化率
		List<DoubleArray> outputInd = getWebServiceParaService.getoutputInd();// 工业产值
		List<DoubleArray> outputAgr = getWebServiceParaService.getoutputAgr();// 农业产值
		List<DoubleArray> outputSer = getWebServiceParaService.getoutputSer();// 服务业产值
		List<DoubleArray> outputTour = getWebServiceParaService.getoutputTour();// 旅游业产值
		// @WebParam(name = "outputIndR") double outputIndR [][], //工业产值变化率
		// @WebParam(name = "outputAgrR") double outputAgrR [][], //农业产值变化率
		// @WebParam(name = "outputSerR") double outputSerR [][], //服务业产值变化率
		List<DoubleArray> outputTourR = getWebServiceParaService.getoutputTourR(projectId);// 旅游业产值变化率
		List<DoubleArray> techProgRR = getWebServiceParaService.gettechProgRR(projectId);// 产业进步率变化率

		// 土地利用情景
		List<DoubleArray> areaAgri = getWebServiceParaService.getareaAgri(projectId);// 耕地面积
		List<DoubleArray> areaAgriR = getWebServiceParaService.getareaAgriR(projectId);// 耕地面积变化率
		List<DoubleArray> areaCropWheat = getWebServiceParaService.getareaCropWheat(projectId);// 作物小麦种植面积
		List<DoubleArray> areaCropCorn = getWebServiceParaService.getareaCropCorn(projectId);// 作物玉米种植面积
		List<DoubleArray> areaCropOilseed = getWebServiceParaService.getareaCropOilseed(projectId); // 作物油料种植面积
		List<DoubleArray> areaCropOrchard = getWebServiceParaService.getareaCropOrchard(projectId);// 作物果园种植面积
		List<DoubleArray> areaCropCotton = getWebServiceParaService.getareaCropCotton(projectId);// 作物棉花种植面积
		List<DoubleArray> areaCropGreenstuff = getWebServiceParaService.getareaCropGreenstuff(projectId);// 作物蔬菜种植面积
		List<DoubleArray> areaCropWheatR = getWebServiceParaService.getareaCropWheatR(projectId);// 作物小麦种植面积变化率
		List<DoubleArray> areaCropCornR = getWebServiceParaService.getareaCropCornR(projectId);// 作物玉米种植面积变化率
		List<DoubleArray> areaCropOilseedR = getWebServiceParaService.getareaCropOilseedR(projectId);// 作物油料种植面积变化率
		List<DoubleArray> areaCropOrchardR = getWebServiceParaService.getareaCropOrchardR(projectId);// 作物果园种植面积变化率
		List<DoubleArray> areaCropCottonR = getWebServiceParaService.getareaCropCottonR(projectId);// 作物棉花种植面积变化率
		List<DoubleArray> areaCropGreenstuffR = getWebServiceParaService.getareaCropGreenstuffR(projectId);// 作物蔬菜种植面积变化率
		List<DoubleArray> areaWetland = getWebServiceParaService.getareaWetland(projectId);// 湿地面积
		List<DoubleArray> areaForest = getWebServiceParaService.getareaForest(projectId);// 林地面积
		List<DoubleArray> areaGrass = getWebServiceParaService.getareaGrass(projectId);// 草地面积
		List<DoubleArray> areaWater = getWebServiceParaService.getareaWater(projectId);// 水域面积
		// @WebParam(name = "areaWetlandR") double areaWetlandR [][], //湿地面积
		// @WebParam(name = "areaForestR") double areaForestR [][], //林地面积变化率
		// @WebParam(name = "areaGrassR") double areaGrassR [][], //草地面积变化率
		// @WebParam(name = "areaWaterR") double areaWaterR [][], //水域面积变化率

		// 水资源管理情景
		List<DoubleArray> waterAlloMid = getWebServiceParaService.getTblMidDownWaterAllo(); // 中游分水量，没有countryId属性的
		List<DoubleArray> waterAlloDown = getWebServiceParaService.getTblDownDownWaterAllo(); // 下游分水量
		List<DoubleArray> waterRight = getWebServiceParaService.getfldWaterRightRatio(projectId); // 水权分配比例
		List<DoubleArray> waterSavingTechR = getWebServiceParaService.getSaveWater(projectId); // 节水技术提高比率

		// System.out.println(allowanceSer.size());
		// System.out.println(waterAlloMid.size());
		// System.out.println(waterAlloDown.size());
		// System.out.println(waterRight.size());

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
			List<DoubleArray> modleOutput = risDSSModelService.getDataYearly("AKH13002", year);
//			System.out.println(modleOutput.size()+"*************");
			/**
			 * 提高水生产力到b%
			 * 
			 * @return
			 */
			double index1 = indexCalculateService.WaterProductivity(modleOutput);

			/**
			 * 在各个层次上减小用水压力到m%
			 * 
			 * @return
			 */
			double index2 = indexCalculateService.reduceWaterUseP(modleOutput);

			/**
			 * 提高流域社会安全饮用水人口比例到d%
			 */
			double index3 = indexCalculateService.SafeDrinkingWaterRate(modleOutput);

			/**
			 * 集成水资源管理效率
			 */
			double index4 = indexCalculateService.IWRMRate(modleOutput);

			/**
			 * 跨边界流域可操作合约有效性e%
			 */
			double index5 = indexCalculateService.TransboundaryAvailability(modleOutput);

			/**
			 * 维持流域可持续湿地面积d万亩
			 */
			double index6 = indexCalculateService.OutputWetlandArea(modleOutput);

			/**
			 * 保证下游可持续生态系统发展所需最小水量f 亿m3
			 */
			double index7 = indexCalculateService.OutputMinWater(modleOutput);

			/**
			 * 中游地下水开采量i 亿m3
			 * 
			 */
			double index8 = indexCalculateService.OutputWaterExtraction(modleOutput);

			/**
			 * 中游生态系统用水量j 亿m3
			 */
			double index9 = indexCalculateService.OutputMidWaterUse(modleOutput);

			/**
			 * 森林覆盖率
			 */
			double index10 = indexCalculateService.ForestCoverageRate(modleOutput);

			/**
			 * 可持续森林管理覆盖b%
			 */
			double index11 = indexCalculateService.ForestSustainableRate(modleOutput);

			/**
			 * 山地绿色覆盖指数b%
			 */
			double index12 = indexCalculateService.MountainGreenCoverageRate(modleOutput);

			/**
			 * 人均GDP
			 */
			double index13 = indexCalculateService.GDPPerCapita(modleOutput);

			/**
			 * 就业人口人均 GDP 增长率
			 */
			double index14 = indexCalculateService.GDPPerPersonEmployed(modleOutput);

			/**
			 * 年轻人（15-24）在教育，就业和培训中的比例
			 */
			double index15 = indexCalculateService.YouthEmpRate(modleOutput);

			/**
			 * 年轻人（15-24）失业率
			 */
			double index16 = indexCalculateService.YouthUnempRate(modleOutput);

			/**
			 * 旅游业产值在 GDP 中的比例
			 */
			double index17 = indexCalculateService.GDPTourismRate(modleOutput);

			/**
			 * 旅游消费
			 */
			double index18 = indexCalculateService.TourConsRate(modleOutput);

			/**
			 * 土地消耗率与人口增长率的比率
			 */
			double index19 = indexCalculateService.LandPopuRate(modleOutput);

			/**
			 * 城镇化率
			 */
			double index20 = indexCalculateService.UrbanizationRate(modleOutput);

			/**
			 * 农业水生产力
			 */
			double index21 = indexCalculateService.WaterProductivityAgri(modleOutput);

			/**
			 * 农业水利用效率
			 */
			double index22 = indexCalculateService.WaterUseEfficiencyAgri(modleOutput);

			/**
			 * 每公顷农产品产值
			 */
			double index23 = indexCalculateService.AgriOutputPerHectare(modleOutput);

			/**
			 * 维持可持续的农业种植面积
			 */
			double index24 = indexCalculateService.OutputAgriArea(modleOutput);

			/**
			 * 可持续社会福利指数
			 */
			double index25 = indexCalculateService.OutputSocialWelWare(modleOutput);

			return index1 + "<br />" + index2 + "<br />" + index3 + "<br />" + index4 + "<br />" + index5 + "<br />" + index6 + "<br />" + index7
					+ "<br />" + index8 + "<br />" + index9 + "<br />" + index10 + "<br />" + index11 + "<br />" + index12 + "<br />" + index13 + "<br />"
					+ index14 + "<br />" + index15 + "<br />" + index16 + "<br />" + index17 + "<br />" + index18 + "<br />" + index19 + "<br />" + index20
					+ "<br />" + index21 + "<br />" + index22 + "<br />" + index23 + "<br />" + index24 + "<br />" + index25;
		} catch (Exception e) {
			return "数据返回错误，请检查";
		}

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
