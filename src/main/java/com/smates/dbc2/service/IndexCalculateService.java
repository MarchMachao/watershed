package com.smates.dbc2.service;

/**
 * 指标计算
 * 
 * @author baijw
 *
 */
public interface IndexCalculateService {

	/**
	 * 提高水生产力到b%
	 */
	public double WaterProductivity(String projectId, String year,String countryId,double outputSer,double waterUseSer);

	/**
	 * 在各个层次上减小用水压力到m%
	 */
	public double reduceWaterUseP();

	/**
	 * 提高流域社会安全饮用水人口比例到d%
	 */
	public double SafeDrinkingWaterRate();

	/**
	 * 集成水资源管理效率
	 */
	public double IWRMRate();

	/**
	 * 跨边界流域可操作合约有效性e%
	 */
	public double TransboundaryAvailability();

	/**
	 * 维持流域可持续湿地面积d万亩
	 */
	public double OutputWetlandArea();

	/**
	 * 保证下游可持续生态系统发展所需最小水量f 亿m3
	 */
	public double OutputMinWater();

	/**
	 * 中游地下水开采量i 亿m3
	 * 
	 */
	public double OutputWaterExtraction();

	/**
	 * 中游生态系统用水量j 亿m3
	 */
	public double OutputMidWaterUse();

	/**
	 * 森林覆盖率
	 */
	public double ForestCoverageRate();

	/**
	 * 可持续森林管理覆盖b%
	 */
	public double ForestSustainableRate();

	/**
	 * 山地绿色覆盖指数b%
	 */
	public double MountainGreenCoverageRate();
	
	/**
	 * 人均GDP
	 */
	public double GDPPerCapita();
	
	/**
	 * 就业人口人均 GDP 增长率 
	 */
	public double GDPPerPersonEmployed();
	
	/**
	 * 年轻人（15-24）在教育，就业和培训中的比例 
	 */
	public double YouthEmpRate();
	
	/**
	 * 年轻人（15-24）失业率 
	 */
	public double YouthUnempRate();
	
	/**
	 * 旅游业产值在 GDP 中的比例
	 */
	public double GDPTourismRate();
	
	/**
	 * 旅游消费 
	 */
	public double TourConsRate();
	
	/**
	 * 土地消耗率与人口增长率的比率
	 */
	public double LandPopuRate();
	
	/**
	 * 城镇化率 
	 */
	public double UrbanizationRate();
	
	/**
	 * 农业水生产力 
	 */
	public double WaterProductivityAgri();
	
	/**
	 * 农业水利用效率 
	 */
	public double WaterUseEfficiencyAgri();
	
	/**
	 * 每公顷农产品产值 
	 */
	public double AgriOutputPerHectare();
	
	/**
	 * 维持可持续的农业种植面积 
	 */
	public double OutputAgriArea();
	
	/**
	 * 可持续社会福利指数 
	 */
	public double OutputSocialWelWare();

}
