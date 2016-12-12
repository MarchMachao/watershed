package com.smates.dbc2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
		if (projectId == null) {
			projectId = userProjectRelationService.getUserProjectRelationByUserName(userService.getCurrentUserId())
					.getAutoProjectId();
		}
		System.out.println(projectId + "," + upstreamCultivatedArea + "," + midstreamWater + "," + downstreamWater + ","
				+ midStreamCultivatedArea + "," + midStreamWetLandArea + "," + midStreamDripIrrigation + ","
				+ downStreamCultivatedArea);
		//上游【耕地面积、湿地面积】
		List<StreamLanUseSceVo> upstreamLanUseSceVos = streamLanUseSceVoDao.getStreamLanUseSceVo("upstream");
		//中游【耕地面积、湿地面积】
		List<StreamLanUseSceVo> midstreamLanUseSceVos = streamLanUseSceVoDao.getStreamLanUseSceVo("midstream");
		//下游【耕地面积、湿地面积】
		List<StreamLanUseSceVo> downstreamLanUseSceVos = streamLanUseSceVoDao.getStreamLanUseSceVo("downstream");
		//中下游分水量
		MidAndDownStreamPercentPara midAndDownStreamPercentPara = watershedParaDao.getMidAndDownStreamPercentPara(projectId);
		//中游滴灌面积
		List<TbSocioEconomyScePara> midStreamTbSocioEconomyScePara = watershedParaDao.getmidStreamSocioEconomyScePara(projectId);
		
		//上游耕地面积和
		double upStramFarmArea = 0;
		for(int i=0;i<upstreamLanUseSceVos.size();i++){
			upStramFarmArea = upStramFarmArea + Double.parseDouble(upstreamLanUseSceVos.get(i).getFldFarmArea());
		}
//		List<CountryIdAndFarmAreaVo> CountryIdAndFarmAreaVos = new ArrayList<CountryIdAndFarmAreaVo>();
		for(int i=0;i<upstreamLanUseSceVos.size();i++){
			double percentArea = (Double.parseDouble(upstreamLanUseSceVos.get(i).getFldFarmArea())/upStramFarmArea)*upStramFarmArea;
			CountryIdAndFarmAreaVo countryIdAndFarmAreaVo = new CountryIdAndFarmAreaVo();
			countryIdAndFarmAreaVo.setCountryId(upstreamLanUseSceVos.get(i).getCountryId());
			countryIdAndFarmAreaVo.setProjectId(projectId);
			countryIdAndFarmAreaVo.setFarmArea(String.valueOf(percentArea));
//			CountryIdAndFarmAreaVos.add(countryIdAndFarmAreaVo);
			gisDao.updateLandUseArea(countryIdAndFarmAreaVo);
		}
		
		//中游耕地耕地面积和，中游湿地面积和
		double midStreamFarmArea = 0,midStreamWetLand = 0;
		for(int i=0;i<midstreamLanUseSceVos.size();i++){
			midStreamFarmArea = midStreamFarmArea + Double.parseDouble(midstreamLanUseSceVos.get(i).getFldFarmArea());
			midStreamWetLand = midStreamWetLand + Double.parseDouble(midstreamLanUseSceVos.get(i).getFldFarmArea());
		}
//		List<CountryIdAndFarmAreaVo> CountryIdAndFarmAreaVos1 = new ArrayList<CountryIdAndFarmAreaVo>();
		for(int i=0;i<midstreamLanUseSceVos.size();i++){
			double percentArea = (Double.parseDouble(midstreamLanUseSceVos.get(i).getFldFarmArea())/midStreamFarmArea)*midStreamFarmArea;
			double percentwet = (Double.parseDouble(midstreamLanUseSceVos.get(i).getFldFarmArea())/midStreamWetLand)*midStreamWetLand;
			CountryIdAndFarmAreaVo countryIdAndFarmAreaVo = new CountryIdAndFarmAreaVo();
			countryIdAndFarmAreaVo.setProjectId(projectId);
			countryIdAndFarmAreaVo.setCountryId(upstreamLanUseSceVos.get(i).getCountryId());
			countryIdAndFarmAreaVo.setFarmArea(percentArea+"");
			countryIdAndFarmAreaVo.setWetLand(percentwet+"");
//			CountryIdAndFarmAreaVos1.add(countryIdAndFarmAreaVo);
			gisDao.updateLandUseArea(countryIdAndFarmAreaVo);
		}
		
		
		//中游滴灌面积和
		double midStreamsprink = 0;
		for(int i=0;i<midStreamTbSocioEconomyScePara.size();i++){
			midStreamsprink = midStreamsprink + Double.parseDouble(midStreamTbSocioEconomyScePara.get(i).getFldSprinkingArea());
		}
		List<CountryIdAndFarmAreaVo> CountryIdAndFarmAreaVos2 = new ArrayList<CountryIdAndFarmAreaVo>();
		for(int i=0;i<midStreamTbSocioEconomyScePara.size();i++){
			double percentArea = (Double.parseDouble(midStreamTbSocioEconomyScePara.get(i).getFldSprinkingArea())/midStreamsprink)*midStreamsprink;
			CountryIdAndFarmAreaVo countryIdAndFarmAreaVo = new CountryIdAndFarmAreaVo();
			countryIdAndFarmAreaVo.setProjectId(projectId);
			countryIdAndFarmAreaVo.setCountryId(upstreamLanUseSceVos.get(i).getCountryId());
			countryIdAndFarmAreaVo.setSprinkArea(percentArea+"");
			CountryIdAndFarmAreaVos2.add(countryIdAndFarmAreaVo);
			gisDao.updateSprinkArea(countryIdAndFarmAreaVo);
		}
		
		
		
		//下游耕地面积和
		double downStreamFarmArea = 0;
		for(int i=0;i<downstreamLanUseSceVos.size();i++){ 
			downStreamFarmArea = downStreamFarmArea + Double.parseDouble(downstreamLanUseSceVos.get(i).getFldFarmArea());
		}
//		List<CountryIdAndFarmAreaVo> CountryIdAndFarmAreaVos3 = new ArrayList<CountryIdAndFarmAreaVo>();
		for(int i=0;i<downstreamLanUseSceVos.size();i++){
			double percentArea = (Double.parseDouble(upstreamLanUseSceVos.get(i).getFldFarmArea())/upStramFarmArea)*upStramFarmArea;
			CountryIdAndFarmAreaVo countryIdAndFarmAreaVo = new CountryIdAndFarmAreaVo();
			countryIdAndFarmAreaVo.setCountryId(upstreamLanUseSceVos.get(i).getCountryId());
			countryIdAndFarmAreaVo.setProjectId(projectId);
			countryIdAndFarmAreaVo.setFarmArea(String.valueOf(percentArea));
//			CountryIdAndFarmAreaVos3.add(countryIdAndFarmAreaVo);
			gisDao.updateLandUseArea(countryIdAndFarmAreaVo);
		}
		
		/**
		 * 更新中下游分水量
		 */
		watershedParaDao.deleteMidAndDownStreamPercentPara(projectId);
		watershedParaDao.addMidAndDownStreamPercentPara(midAndDownStreamPercentPara);
		
		return new BaseMsg(true, "情景控制保存成功");
	}

}
