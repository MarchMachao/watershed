package com.smates.dbc2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smates.dbc2.utils.ExcelUtils;

/**
 * 下载Excel的类
 * 
 * @author March march.machao@gmail.com
 *
 */
@Controller
public class ExcelControlle {

	@Autowired
	private ExcelUtils excelUtils;

	@RequestMapping(value = "downExcel")
	public void downExcel() {

		excelUtils.outputExcel();
	}
}
