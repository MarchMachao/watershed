package com.smates.dbc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smates.dbc2.webservicedemo.inputdata.InputDataService;
import com.smates.dbc2.webservicedemo.inputdata.InputDataServiceImplService;
import com.smates.dbc2.webservicedemo.outputdata.OutputDataService;
import com.smates.dbc2.webservicedemo.outputdata.OutputDataServiceImplService;
import com.smates.dbc2.webservicedemo.querystate.QueryStateService;
import com.smates.dbc2.webservicedemo.querystate.QueryStateServiceImplService;

/**
 * @author machao march.machao@gmail.com
 * @version 创建时间：2016年10月26日 下午12:53:56
 * 
 *          webservice的controller
 */

@Controller
public class WebserviceController {

	private InputDataService inputDataService = new InputDataServiceImplService().getInputDataServiceImplPort();
	private OutputDataService outputDataService = new OutputDataServiceImplService().getOutputDataServiceImplPort();
	private QueryStateService queryStateService = new QueryStateServiceImplService().getQueryStateServiceImplPort();

	/**
	 * 
	 * @param 传入数据a
	 * @param 传入数据b
	 * @return 传入数据成功！
	 */
	@ResponseBody
	@RequestMapping(value = "inputdatawebservice", method = RequestMethod.POST)
	public String inputdata(String a, String b) {
		return inputDataService.inputData(a, b);
	}

	/**
	 * 
	 * @return 输出数据
	 */
	@ResponseBody
	@RequestMapping(value = "outputdatawebservice", method = RequestMethod.POST)
	public String outputdata() {
		return outputDataService.outputData();
	}

	/**
	 * 
	 * @return 查询状态
	 */
	@ResponseBody
	@RequestMapping(value = "querystatewebservice", method = RequestMethod.POST)
	public String querystate() {
		return queryStateService.queryState();
	}

}
