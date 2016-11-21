package com.smates.dbc2.po;

/**
 * 为了给json模型传参的类
 * 
 * @author machao
 *
 */
public class Indicators {

	private String waterProductivity;// 提高水生产力到b%
	private String waterPressure; // 在各个层次上减小用水压力到m%
	private String safeDrinkingWaterR;// 提高流域社会安全饮用水人口比例到d%
	private String iwrmR;// 集成水资源管理效率
	private String transboundaryAvailability;// 跨边界流域可操作合约有效性e%
	private String areaWetland; // 维持流域可持续湿地面积d万亩
	private String waterDemandEco; // 保证下游可持续生态系统发展所需最小水量f 亿m3
	private String groundwaterMining;// 中游地下水开采量i 亿m3
	private String waterUseEco; // 中游生态系统用水量j 亿m3
	private String forestCoverR;// 森林覆盖率
	private String forestSustainableR;// 可持续森林管理覆盖b%
	private String mountainGreenCoverR;// 山地绿色覆盖指数b%
	private String gdpPerCapita;// 人均GDP
	private String gdpPerCapitaEmployed;// 就业人口人均 GDP 增长率
	private String youthEmpR;// 年轻人（15-24）在教育，就业和培训中的比例
	private String youthUnempR;// 年轻人（15-24）失业率
	private String gdpTourismR;// 旅游业产值在 GDP 中的比例
	private String tourConsR;// 旅游消费
	private String landPopuR;// 土地消耗率与人口增长率的比率
	private String urbanR;// 城镇化率
	private String waterProductivityAgri;// 农业水生产力
	private String waterUseEffiAgri;// 农业水利用效率
	private String agriOutputPerHectare;// 每公顷农产品产值
	private String areaCrop; // 维持可持续农业种植面积
	private String socialWelfareIndex;// 可持续社会福利指数

	public Indicators() {
	}

	public Indicators(String waterProductivity, String waterPressure, String safeDrinkingWaterR, String iwrmR,
			String transboundaryAvailability, String areaWetland, String waterDemandEco, String groundwaterMining,
			String waterUseEco, String forestCoverR, String forestSustainableR, String mountainGreenCoverR,
			String gdpPerCapita, String gdpPerCapitaEmployed, String youthEmpR, String youthUnempR, String gdpTourismR,
			String tourConsR, String landPopuR, String urbanR, String waterProductivityAgri, String waterUseEffiAgri,
			String agriOutputPerHectare, String areaCrop, String socialWelfareIndex) {
		super();
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

	public String getWaterProductivity() {
		return waterProductivity;
	}

	public void setWaterProductivity(String waterProductivity) {
		this.waterProductivity = waterProductivity;
	}

	public String getWaterPressure() {
		return waterPressure;
	}

	public void setWaterPressure(String waterPressure) {
		this.waterPressure = waterPressure;
	}

	public String getSafeDrinkingWaterR() {
		return safeDrinkingWaterR;
	}

	public void setSafeDrinkingWaterR(String safeDrinkingWaterR) {
		this.safeDrinkingWaterR = safeDrinkingWaterR;
	}

	public String getIwrmR() {
		return iwrmR;
	}

	public void setIwrmR(String iwrmR) {
		this.iwrmR = iwrmR;
	}

	public String getTransboundaryAvailability() {
		return transboundaryAvailability;
	}

	public void setTransboundaryAvailability(String transboundaryAvailability) {
		this.transboundaryAvailability = transboundaryAvailability;
	}

	public String getAreaWetland() {
		return areaWetland;
	}

	public void setAreaWetland(String areaWetland) {
		this.areaWetland = areaWetland;
	}

	public String getWaterDemandEco() {
		return waterDemandEco;
	}

	public void setWaterDemandEco(String waterDemandEco) {
		this.waterDemandEco = waterDemandEco;
	}

	public String getGroundwaterMining() {
		return groundwaterMining;
	}

	public void setGroundwaterMining(String groundwaterMining) {
		this.groundwaterMining = groundwaterMining;
	}

	public String getWaterUseEco() {
		return waterUseEco;
	}

	public void setWaterUseEco(String waterUseEco) {
		this.waterUseEco = waterUseEco;
	}

	public String getForestCoverR() {
		return forestCoverR;
	}

	public void setForestCoverR(String forestCoverR) {
		this.forestCoverR = forestCoverR;
	}

	public String getForestSustainableR() {
		return forestSustainableR;
	}

	public void setForestSustainableR(String forestSustainableR) {
		this.forestSustainableR = forestSustainableR;
	}

	public String getMountainGreenCoverR() {
		return mountainGreenCoverR;
	}

	public void setMountainGreenCoverR(String mountainGreenCoverR) {
		this.mountainGreenCoverR = mountainGreenCoverR;
	}

	public String getGdpPerCapita() {
		return gdpPerCapita;
	}

	public void setGdpPerCapita(String gdpPerCapita) {
		this.gdpPerCapita = gdpPerCapita;
	}

	public String getGdpPerCapitaEmployed() {
		return gdpPerCapitaEmployed;
	}

	public void setGdpPerCapitaEmployed(String gdpPerCapitaEmployed) {
		this.gdpPerCapitaEmployed = gdpPerCapitaEmployed;
	}

	public String getYouthEmpR() {
		return youthEmpR;
	}

	public void setYouthEmpR(String youthEmpR) {
		this.youthEmpR = youthEmpR;
	}

	public String getYouthUnempR() {
		return youthUnempR;
	}

	public void setYouthUnempR(String youthUnempR) {
		this.youthUnempR = youthUnempR;
	}

	public String getGdpTourismR() {
		return gdpTourismR;
	}

	public void setGdpTourismR(String gdpTourismR) {
		this.gdpTourismR = gdpTourismR;
	}

	public String getTourConsR() {
		return tourConsR;
	}

	public void setTourConsR(String tourConsR) {
		this.tourConsR = tourConsR;
	}

	public String getLandPopuR() {
		return landPopuR;
	}

	public void setLandPopuR(String landPopuR) {
		this.landPopuR = landPopuR;
	}

	public String getUrbanR() {
		return urbanR;
	}

	public void setUrbanR(String urbanR) {
		this.urbanR = urbanR;
	}

	public String getWaterProductivityAgri() {
		return waterProductivityAgri;
	}

	public void setWaterProductivityAgri(String waterProductivityAgri) {
		this.waterProductivityAgri = waterProductivityAgri;
	}

	public String getWaterUseEffiAgri() {
		return waterUseEffiAgri;
	}

	public void setWaterUseEffiAgri(String waterUseEffiAgri) {
		this.waterUseEffiAgri = waterUseEffiAgri;
	}

	public String getAgriOutputPerHectare() {
		return agriOutputPerHectare;
	}

	public void setAgriOutputPerHectare(String agriOutputPerHectare) {
		this.agriOutputPerHectare = agriOutputPerHectare;
	}

	public String getAreaCrop() {
		return areaCrop;
	}

	public void setAreaCrop(String areaCrop) {
		this.areaCrop = areaCrop;
	}

	public String getSocialWelfareIndex() {
		return socialWelfareIndex;
	}

	public void setSocialWelfareIndex(String socialWelfareIndex) {
		this.socialWelfareIndex = socialWelfareIndex;
	}


}
