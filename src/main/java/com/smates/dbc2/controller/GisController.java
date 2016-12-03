package com.smates.dbc2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.smates.dbc2.po.Gisecharts;
import com.smates.dbc2.service.GisService;
import com.smates.dbc2.vo.BaseMsg;

@Controller
public class GisController {

	@Autowired
	private GisService gisService;

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

}
