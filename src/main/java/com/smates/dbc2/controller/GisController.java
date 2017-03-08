package com.smates.dbc2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.smates.dbc2.mapper.GisDao;
import com.smates.dbc2.po.Gisecharts;
import com.smates.dbc2.po.MidAndDownStreamPercentPara;
import com.smates.dbc2.po.TbSocioEconomyScePara;
import com.smates.dbc2.service.GisService;
import com.smates.dbc2.vo.BaseMsg;
import com.smates.dbc2.vo.CountryIdAndFarmAreaVo;
import com.smates.dbc2.vo.StreamLanUseSceVo;

@Controller
public class GisController extends BaseController {

	@Autowired
	private GisService gisService; 

	@Autowired
	private GisDao gisDao;

	@RequestMapping("gis")
	public String Gis(ModelMap modelMap) {
		try {
			String projectId = userProjectRelationService
					.getUserProjectRelationByUserName(userService.getCurrentUserId()).getAutoProjectId();
			// 上游【耕地面积、湿地面积】
			List<StreamLanUseSceVo> upstreamLanUseSceVos = streamLanUseSceVoDao.getStreamLanUseSceVo("upstream");
			// 中游【耕地面积、湿地面积】
			List<StreamLanUseSceVo> midstreamLanUseSceVos = streamLanUseSceVoDao.getStreamLanUseSceVo("midstream");
			// 下游【耕地面积、湿地面积】
			List<StreamLanUseSceVo> downstreamLanUseSceVos = streamLanUseSceVoDao.getStreamLanUseSceVo("downstream");
			// 中下游分水量
			MidAndDownStreamPercentPara midAndDownStreamPercentPara = watershedParaDao
					.getMidAndDownStreamPercentPara(projectId);
			// 中游滴灌面积
			List<TbSocioEconomyScePara> midStreamTbSocioEconomyScePara = watershedParaDao
					.getmidStreamSocioEconomyScePara(projectId);

			// 上游耕地面积和
			double upStramFarmArea = 0;
			if (upstreamLanUseSceVos != null) {
				for (int i = 0; i < upstreamLanUseSceVos.size(); i++) {
					upStramFarmArea = upStramFarmArea
							+ Double.parseDouble(upstreamLanUseSceVos.get(i).getFldFarmArea());
				}
			}

			// 中游耕地耕地面积和，中游湿地面积和
			double midStreamFarmArea = 0, midStreamWetLand = 0;
			if (midstreamLanUseSceVos != null) {
				for (int i = 0; i < midstreamLanUseSceVos.size(); i++) {
					midStreamFarmArea = midStreamFarmArea
							+ Double.parseDouble(midstreamLanUseSceVos.get(i).getFldFarmArea());
					midStreamWetLand = midStreamWetLand
							+ Double.parseDouble(midstreamLanUseSceVos.get(i).getWetlandArea());
				}
			}

			// 中游滴灌面积和
			double midStreamsprink = 0;
			if (midStreamTbSocioEconomyScePara != null) {
				for (int i = 0; i < midStreamTbSocioEconomyScePara.size(); i++) {
					midStreamsprink = midStreamsprink
							+ Double.parseDouble(midStreamTbSocioEconomyScePara.get(i).getFldSprinkingArea());
				}
			}

			// 下游耕地面积和
			double downStreamFarmArea = 0;
			if (downstreamLanUseSceVos != null) {
				for (int i = 0; i < downstreamLanUseSceVos.size(); i++) {
					downStreamFarmArea = downStreamFarmArea
							+ Double.parseDouble(downstreamLanUseSceVos.get(i).getFldFarmArea());
				}
			}
			modelMap.addAttribute("value1", upStramFarmArea);// 上游耕地面积
			modelMap.addAttribute("value2", midStreamFarmArea);// 中游耕地面积
			modelMap.addAttribute("value3", midStreamWetLand);// 中游湿地面积
			modelMap.addAttribute("value4", midStreamsprink);// 中游滴灌面积
			modelMap.addAttribute("value5", downStreamFarmArea);// 下游耕地面积
			modelMap.addAttribute("value6", midAndDownStreamPercentPara.getMidstreamPercent());// 中游分水量
			modelMap.addAttribute("value7", midAndDownStreamPercentPara.getDownstreamPercent());// 下游分水量
			return "GIS.ftl";
		} catch (NullPointerException e) {
			modelMap.addAttribute("value1", 252);// 上游耕地面积
			modelMap.addAttribute("value2", 306);// 中游耕地面积
			modelMap.addAttribute("value3", 198);// 中游湿地面积
			modelMap.addAttribute("value4", 165);// 中游滴灌面积
			modelMap.addAttribute("value5", 305);// 下游耕地面积
			modelMap.addAttribute("value6", 188);// 中游分水量
			modelMap.addAttribute("value7", 188);// 下游分水量
			return "GIS.ftl";
		}

	}

	@ResponseBody
	@RequestMapping(value = "saveGisEcharts", method = RequestMethod.POST)
	public BaseMsg saveGisEcharts(String years, String results) {
		List<String> years2 = JSON.parseArray(years, String.class);
		List<Gisecharts> result = JSON.parseArray(results, Gisecharts.class);
		for (int i = 0; i < years2.size(); i++) {
			gisService.deleteGisecharts(years2.get(i));
			gisService.addGisecharts(years2.get(i), result.get(i).getResultOverall(), result.get(i).getResultP1(),
					result.get(i).getResultP2(), result.get(i).getResultP3());
		}
		gisService.updateDevelop();
		gisService.updateGisIndex();
		gisService.updateThreeindex();
		return new BaseMsg(true, "指标计算成功！");
	}

	@ResponseBody
	@RequestMapping(value = "getGisEcharts", method = RequestMethod.GET)
	public List<Gisecharts> getGisEcharts() {
		return gisService.getAllGisecharts();
	}

	/**
	 * 接收从GIS情景控制传来的全局变量
	 * 
	 * @param projectId
	 *            项目代码【为null时值为默认项目id】
	 * @param upstreamCultivatedArea
	 *            上游耕地面积
	 * @param midstreamWater
	 *            中游分水量
	 * @param downstreamWater
	 *            下游分水量
	 * @param midStreamCultivatedArea
	 *            中游耕地面积
	 * @param midStreamWetLandArea
	 *            中游湿地面积
	 * @param midStreamDripIrrigation
	 *            中游滴灌面积
	 * @param downStreamCultivatedArea
	 *            下游耕地面积
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "stuationControl", method = RequestMethod.GET)
	public BaseMsg stuationControl(String projectId, String upstreamCultivatedArea, String midstreamWater,
			String downstreamWater, String midStreamCultivatedArea, String midStreamWetLandArea,
			String midStreamDripIrrigation, String downStreamCultivatedArea) {
		try {

			if (projectId == null) {
				projectId = userProjectRelationService.getUserProjectRelationByUserName(userService.getCurrentUserId())
						.getAutoProjectId();
			}
			System.out.println(projectId + "," + upstreamCultivatedArea + "," + midstreamWater + "," + downstreamWater
					+ "," + midStreamCultivatedArea + "," + midStreamWetLandArea + "," + midStreamDripIrrigation + ","
					+ downStreamCultivatedArea);
			// 上游【耕地面积、湿地面积】
			List<StreamLanUseSceVo> upstreamLanUseSceVos = streamLanUseSceVoDao.getStreamLanUseSceVo("upstream");
			// 中游【耕地面积、湿地面积】
			List<StreamLanUseSceVo> midstreamLanUseSceVos = streamLanUseSceVoDao.getStreamLanUseSceVo("midstream");
			// 下游【耕地面积、湿地面积】
			List<StreamLanUseSceVo> downstreamLanUseSceVos = streamLanUseSceVoDao.getStreamLanUseSceVo("downstream");
			// 中下游分水量
			MidAndDownStreamPercentPara midAndDownStreamPercentPara = watershedParaDao
					.getMidAndDownStreamPercentPara(projectId);
			// 中游滴灌面积
			List<TbSocioEconomyScePara> midStreamTbSocioEconomyScePara = watershedParaDao
					.getmidStreamSocioEconomyScePara(projectId);

			// 上游耕地面积和

			if (upstreamLanUseSceVos != null) {
				double upStramFarmArea = 0;
				for (int i = 0; i < upstreamLanUseSceVos.size(); i++) {
					upStramFarmArea = upStramFarmArea
							+ Double.parseDouble(upstreamLanUseSceVos.get(i).getFldFarmArea());
				}
				for (int i = 0; i < upstreamLanUseSceVos.size(); i++) {
					double percentArea = (Double.parseDouble(upstreamLanUseSceVos.get(i).getFldFarmArea())
							/ upStramFarmArea) * Double.parseDouble(upstreamCultivatedArea);
					CountryIdAndFarmAreaVo countryIdAndFarmAreaVo = new CountryIdAndFarmAreaVo();
					countryIdAndFarmAreaVo.setCountryId(upstreamLanUseSceVos.get(i).getCountryId());
					countryIdAndFarmAreaVo.setProjectId(projectId);
					countryIdAndFarmAreaVo.setFarmArea(String.valueOf(percentArea));
					gisDao.updateLandUseArea(countryIdAndFarmAreaVo);
				}
			}

			// 中游耕地耕地面积和，中游湿地面积和
			if (midstreamLanUseSceVos != null) {
				double midStreamFarmArea = 0, midStreamWetLand = 0;
				for (int i = 0; i < midstreamLanUseSceVos.size(); i++) {
					midStreamFarmArea = midStreamFarmArea
							+ Double.parseDouble(midstreamLanUseSceVos.get(i).getFldFarmArea());
					midStreamWetLand = midStreamWetLand
							+ Double.parseDouble(midstreamLanUseSceVos.get(i).getWetlandArea());
				}
				System.out.println("baijw midStreamFarmArea:" + midStreamFarmArea + "," + midStreamWetLand);
				// List<CountryIdAndFarmAreaVo> CountryIdAndFarmAreaVos1 = new
				// ArrayList<CountryIdAndFarmAreaVo>();
				for (int i = 0; i < midstreamLanUseSceVos.size(); i++) {
					double percentArea = (Double.parseDouble(midstreamLanUseSceVos.get(i).getFldFarmArea())
							/ midStreamFarmArea) * Double.parseDouble(midStreamCultivatedArea);
					double percentwet = (Double.parseDouble(midstreamLanUseSceVos.get(i).getWetlandArea())
							/ midStreamWetLand) * Double.parseDouble(midStreamWetLandArea);
					CountryIdAndFarmAreaVo countryIdAndFarmAreaVo = new CountryIdAndFarmAreaVo();
					countryIdAndFarmAreaVo.setProjectId(projectId);
					countryIdAndFarmAreaVo.setCountryId(midstreamLanUseSceVos.get(i).getCountryId());
					countryIdAndFarmAreaVo.setFarmArea(percentArea + "");
					countryIdAndFarmAreaVo.setWetLand(percentwet + "");
					// CountryIdAndFarmAreaVos1.add(countryIdAndFarmAreaVo);
					System.out.println(percentArea + "," + percentwet);
					gisDao.updateLandUseArea(countryIdAndFarmAreaVo);
				}
			}

			// 中游滴灌面积和
			if (midStreamTbSocioEconomyScePara != null) {
				double midStreamsprink = 0;
				for (int i = 0; i < midStreamTbSocioEconomyScePara.size(); i++) {
					midStreamsprink = midStreamsprink
							+ Double.parseDouble(midStreamTbSocioEconomyScePara.get(i).getFldSprinkingArea());
				}
				// List<CountryIdAndFarmAreaVo> CountryIdAndFarmAreaVos2 = new
				// ArrayList<CountryIdAndFarmAreaVo>();
				for (int i = 0; i < midStreamTbSocioEconomyScePara.size(); i++) {
					double percentArea = (Double
							.parseDouble(midStreamTbSocioEconomyScePara.get(i).getFldSprinkingArea()) / midStreamsprink)
							* Double.parseDouble(midStreamDripIrrigation);
					CountryIdAndFarmAreaVo countryIdAndFarmAreaVo = new CountryIdAndFarmAreaVo();
					countryIdAndFarmAreaVo.setProjectId(projectId);
					countryIdAndFarmAreaVo.setCountryId(midStreamTbSocioEconomyScePara.get(i).getCountryId());
					countryIdAndFarmAreaVo.setSprinkArea(percentArea + "");
					// CountryIdAndFarmAreaVos2.add(countryIdAndFarmAreaVo);
					gisDao.updateSprinkArea(countryIdAndFarmAreaVo);
				}
			}

			// 下游耕地面积和
			if (downstreamLanUseSceVos != null) {
				double downStreamFarmArea = 0;
				for (int i = 0; i < downstreamLanUseSceVos.size(); i++) {
					downStreamFarmArea = downStreamFarmArea
							+ Double.parseDouble(downstreamLanUseSceVos.get(i).getFldFarmArea());
				}
				// List<CountryIdAndFarmAreaVo> CountryIdAndFarmAreaVos3 = new
				// ArrayList<CountryIdAndFarmAreaVo>();
				for (int i = 0; i < downstreamLanUseSceVos.size(); i++) {
					double percentArea = (Double.parseDouble(downstreamLanUseSceVos.get(i).getFldFarmArea())
							/ downStreamFarmArea) * Double.parseDouble(downStreamCultivatedArea);
					CountryIdAndFarmAreaVo countryIdAndFarmAreaVo = new CountryIdAndFarmAreaVo();
					countryIdAndFarmAreaVo.setCountryId(downstreamLanUseSceVos.get(i).getCountryId());
					countryIdAndFarmAreaVo.setProjectId(projectId);
					countryIdAndFarmAreaVo.setFarmArea(String.valueOf(percentArea));
					// CountryIdAndFarmAreaVos3.add(countryIdAndFarmAreaVo);
					gisDao.updateLandUseArea(countryIdAndFarmAreaVo);
				}
			}

			/**
			 * 更新中下游分水量
			 */
			watershedParaDao.deleteMidAndDownStreamPercentPara(projectId);
			midAndDownStreamPercentPara.setMidstreamPercent(Double.parseDouble(midstreamWater));
			midAndDownStreamPercentPara.setDownstreamPercent(Double.parseDouble(downstreamWater));
			watershedParaDao.addMidAndDownStreamPercentPara(midAndDownStreamPercentPara);
			return new BaseMsg(true, "情景控制保存成功");
		} catch (NullPointerException e) {
			return new BaseMsg(false, "您没有权限！");
		}

	}

}
