package com.smates.dbc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smates.dbc2.ws.RisDSSModelService;
import com.smates.dbc2.ws.RisDSSModelServiceImplService;

/**
 * @author machao march.machao@gmail.com
 * @version 创建时间：2016年10月26日 下午12:53:56
 * 
 *          webservice的controller
 */

@Controller
public class WebserviceController {

	private RisDSSModelService risDSSModelService = new RisDSSModelServiceImplService().getRisDSSModelServiceImplPort();

	/**
	 * 
	 * @param 传入数据a
	 * @param 传入数据b
	 * @return 传入数据成功！
	 */
	@ResponseBody
	@RequestMapping(value = "inputdatawebservice", method = RequestMethod.POST)
	public String inputdata(String a, String b) {
//		return inputDataService.inputData(a, b);
		return null;
	}

	/**
	 * 
	 * @return 输出数据
	 */
	@ResponseBody
	@RequestMapping(value = "outputdatawebservice", method = RequestMethod.POST)
	public String outputdata() {
//		return outputDataService.outputData();
		return null;
	}

	/**
	 * 
	 * @return 查询状态
	 */
	@ResponseBody
	@RequestMapping(value = "querystatewebservice", method = RequestMethod.POST)
	public String querystate() {
		// return queryStateService.queryState();
		return null;
	}

}
