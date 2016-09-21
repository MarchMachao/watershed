package com.smates.dbc2.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("admin")
@Controller
public class MenuController extends BaseController {

	public Logger logger = Logger.getLogger(MenuController.class);

}
