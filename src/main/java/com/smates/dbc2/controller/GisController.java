package com.smates.dbc2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smates.dbc2.po.Gisecharts;
import com.smates.dbc2.service.GisService;
import com.smates.dbc2.vo.BaseMsg;

@Controller
public class GisController {
	@Autowired
	private GisService gisService;

	@ResponseBody
	@RequestMapping(value = "saveGisEcharts", method = RequestMethod.POST)
	public BaseMsg saveGisEcharts(String year, String resultOverall, String resultP1, String resultP2,
			String resultP3) {
		gisService.deleteGisecharts(year);
		gisService.addGisecharts(year, resultOverall, resultP1, resultP2, resultP3);
		return new BaseMsg(true, "指标计算成功！");
	}

	@ResponseBody
	@RequestMapping(value = "getGisEcharts", method = RequestMethod.GET)
	public List<Gisecharts> getGisEcharts() {
		return gisService.getAllGisecharts();
	}

}
