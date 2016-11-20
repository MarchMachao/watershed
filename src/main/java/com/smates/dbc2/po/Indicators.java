package com.smates.dbc2.po;

/**
 * 为了给json模型传参的类
 * 
 * @author machao
 *
 */
public class Indicators {

	private double waterProductivity;// 提高水生产力到b%
	private double waterPressure; // 在各个层次上减小用水压力到m%
	private double safeDrinkingWaterR;// 提高流域社会安全饮用水人口比例到d%
	private double iwrmR;// 集成水资源管理效率
	private double transboundaryAvailability;// 跨边界流域可操作合约有效性e%
	private double areaWetland; // 维持流域可持续湿地面积d万亩
	private double waterDemandEco; // 保证下游可持续生态系统发展所需最小水量f 亿m3
	private double groundwaterMining;// 中游地下水开采量i 亿m3
	private double waterUseEco; // 中游生态系统用水量j 亿m3
	private double forestCoverR;// 森林覆盖率
	private double forestSustainableR;// 可持续森林管理覆盖b%
	private double mountainGreenCoverR;// 山地绿色覆盖指数b%
	private double gdpPerCapita;// 人均GDP
	private double gdpPerCapitaEmployed;// 就业人口人均 GDP 增长率
	private double youthEmpR;// 年轻人（15-24）在教育，就业和培训中的比例
	private double youthUnempR;// 年轻人（15-24）失业率
	private double gdpTourismR;// 旅游业产值在 GDP 中的比例
	private double tourConsR;// 旅游消费
	private double landPopuR;// 土地消耗率与人口增长率的比率
	private double urbanR;// 城镇化率
	private double waterProductivityAgri;// 农业水生产力
	private double waterUseEffiAgri;// 农业水利用效率
	private double agriOutputPerHectare;// 每公顷农产品产值
	private double areaCrop; // 维持可持续农业种植面积
	private double socialWelfareIndex;// 可持续社会福利指数

	public Indicators() {
	}

	public Indicators(double waterProductivity, double waterPressure, double safeDrinkingWaterR, double iwrmR,
			double transboundaryAvailability, double areaWetland, double waterDemandEco, double groundwaterMining,
			double waterUseEco, double forestCoverR, double forestSustainableR, double mountainGreenCoverR,
			double gdpPerCapita, double gdpPerCapitaEmployed, double youthEmpR, double youthUnempR, double gdpTourismR,
			double tourConsR, double landPopuR, double urbanR, double waterProductivityAgri, double waterUseEffiAgri,
			double agriOutputPerHectare, double areaCrop, double socialWelfareIndex) {
		this.waterProductivity = waterProductivity;
		this.waterPressure = waterPressure;
		this.safeDrinkingWaterR = safeDrinkingWaterR;
		this.iwrmR = iwrmR;
		this.transboundaryAvailability = transboundaryAvailability;
		this.areaWetland = areaWetland;
		this.waterDemandEco = waterDemandEco;
		this.groundwaterMining = groundwaterMining;
		this.waterUseEco = waterUseEco;
		this.forestCoverR = forestCoverR;
		this.forestSustainableR = forestSustainableR;
		this.mountainGreenCoverR = mountainGreenCoverR;
		this.gdpPerCapita = gdpPerCapita;
		this.gdpPerCapitaEmployed = gdpPerCapitaEmployed;
		this.youthEmpR = youthEmpR;
		this.youthUnempR = youthUnempR;
		this.gdpTourismR = gdpTourismR;
		this.tourConsR = tourConsR;
		this.landPopuR = landPopuR;
		this.urbanR = urbanR;
		this.waterProductivityAgri = waterProductivityAgri;
		this.waterUseEffiAgri = waterUseEffiAgri;
		this.agriOutputPerHectare = agriOutputPerHectare;
		this.areaCrop = areaCrop;
		this.socialWelfareIndex = socialWelfareIndex;
	}

	public double getWaterProductivity() {
		return waterProductivity;
	}

	public void setWaterProductivity(double waterProductivity) {
		this.waterProductivity = waterProductivity;
	}

	public double getWaterPressure() {
		return waterPressure;
	}

	public void setWaterPressure(double waterPressure) {
		this.waterPressure = waterPressure;
	}

	public double getSafeDrinkingWaterR() {
		return safeDrinkingWaterR;
	}

	public void setSafeDrinkingWaterR(double safeDrinkingWaterR) {
		this.safeDrinkingWaterR = safeDrinkingWaterR;
	}

	public double getIwrmR() {
		return iwrmR;
	}

	public void setIwrmR(double iwrmR) {
		this.iwrmR = iwrmR;
	}

	public double getTransboundaryAvailability() {
		return transboundaryAvailability;
	}

	public void setTransboundaryAvailability(double transboundaryAvailability) {
		this.transboundaryAvailability = transboundaryAvailability;
	}

	public double getAreaWetland() {
		return areaWetland;
	}

	public void setAreaWetland(double areaWetland) {
		this.areaWetland = areaWetland;
	}

	public double getWaterDemandEco() {
		return waterDemandEco;
	}

	public void setWaterDemandEco(double waterDemandEco) {
		this.waterDemandEco = waterDemandEco;
	}

	public double getGroundwaterMining() {
		return groundwaterMining;
	}

	public void setGroundwaterMining(double groundwaterMining) {
		this.groundwaterMining = groundwaterMining;
	}

	public double getWaterUseEco() {
		return waterUseEco;
	}

	public void setWaterUseEco(double waterUseEco) {
		this.waterUseEco = waterUseEco;
	}

	public double getForestCoverR() {
		return forestCoverR;
	}

	public void setForestCoverR(double forestCoverR) {
		this.forestCoverR = forestCoverR;
	}

	public double getForestSustainableR() {
		return forestSustainableR;
	}

	public void setForestSustainableR(double forestSustainableR) {
		this.forestSustainableR = forestSustainableR;
	}

	public double getMountainGreenCoverR() {
		return mountainGreenCoverR;
	}

	public void setMountainGreenCoverR(double mountainGreenCoverR) {
		this.mountainGreenCoverR = mountainGreenCoverR;
	}

	public double getGdpPerCapita() {
		return gdpPerCapita;
	}

	public void setGdpPerCapita(double gdpPerCapita) {
		this.gdpPerCapita = gdpPerCapita;
	}

	public double getGdpPerCapitaEmployed() {
		return gdpPerCapitaEmployed;
	}

	public void setGdpPerCapitaEmployed(double gdpPerCapitaEmployed) {
		this.gdpPerCapitaEmployed = gdpPerCapitaEmployed;
	}

	public double getYouthEmpR() {
		return youthEmpR;
	}

	public void setYouthEmpR(double youthEmpR) {
		this.youthEmpR = youthEmpR;
	}

	public double getYouthUnempR() {
		return youthUnempR;
	}

	public void setYouthUnempR(double youthUnempR) {
		this.youthUnempR = youthUnempR;
	}

	public double getGdpTourismR() {
		return gdpTourismR;
	}

	public void setGdpTourismR(double gdpTourismR) {
		this.gdpTourismR = gdpTourismR;
	}

	public double getTourConsR() {
		return tourConsR;
	}

	public void setTourConsR(double tourConsR) {
		this.tourConsR = tourConsR;
	}

	public double getLandPopuR() {
		return landPopuR;
	}

	public void setLandPopuR(double landPopuR) {
		this.landPopuR = landPopuR;
	}

	public double getUrbanR() {
		return urbanR;
	}

	public void setUrbanR(double urbanR) {
		this.urbanR = urbanR;
	}

	public double getWaterProductivityAgri() {
		return waterProductivityAgri;
	}

	public void setWaterProductivityAgri(double waterProductivityAgri) {
		this.waterProductivityAgri = waterProductivityAgri;
	}

	public double getWaterUseEffiAgri() {
		return waterUseEffiAgri;
	}

	public void setWaterUseEffiAgri(double waterUseEffiAgri) {
		this.waterUseEffiAgri = waterUseEffiAgri;
	}

	public double getAgriOutputPerHectare() {
		return agriOutputPerHectare;
	}

	public void setAgriOutputPerHectare(double agriOutputPerHectare) {
		this.agriOutputPerHectare = agriOutputPerHectare;
	}

	public double getAreaCrop() {
		return areaCrop;
	}

	public void setAreaCrop(double areaCrop) {
		this.areaCrop = areaCrop;
	}

	public double getSocialWelfareIndex() {
		return socialWelfareIndex;
	}

	public void setSocialWelfareIndex(double socialWelfareIndex) {
		this.socialWelfareIndex = socialWelfareIndex;
	}

}
