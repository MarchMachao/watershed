package com.smates.dbc2.controller;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smates.dbc2.po.User;
import com.smates.dbc2.utils.SysConst;

/**
 * 用户相关的请求
 * 
 * @author tangShilong
 *
 */
@Controller
public class UserController extends BaseController {
	private static Logger logger = Logger.getLogger(UserController.class);

	/**
	 * 返回登录界面
	 * 
	 * @return
	 */
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(ModelMap modelMap,String language) {
		modelMap.addAttribute("title", chineseAndEnglishService.getPhraseByIndexAndLanguage(1, language));
		modelMap.addAttribute("save", chineseAndEnglishService.getPhraseByIndexAndLanguage(10, language));
		modelMap.addAttribute("reset", chineseAndEnglishService.getPhraseByIndexAndLanguage(11, language));
		return "Login.ftl";
	}

	/**
	 * 处理登录请求
	 * 
	 * @param userid
	 *            用户登录的accountNumber
	 * @param userpwd
	 *            用户登录的明文密码
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String submit(ModelMap modelMap, String accountNumber, String userpwd,String language) {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(accountNumber, userpwd);
		try {
			subject.login(token);
		} catch (AuthenticationException ae) {
			logger.info("账号或密码错误");
			modelMap.addAttribute("callback", "账号或密码错误");
			return "0";
		}
		logger.info("登录成功");
		userAndLanguageService.updateUserAndLanguage(accountNumber, language);
		return "1";
	}

	/**
	 * 登出
	 * 
	 * @return
	 */
	@RequestMapping("logout")
	public String logout() {
		SecurityUtils.getSubject().logout();
		return "redirect:login.do";
	}

	/**
	 * 登录成功后,显示主界面,根据用户不同的权限,显示不同的菜单
	 * 
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("home")
	public String home(ModelMap modelMap) {
		userLanguage = userAndLanguageService.getUserAndLanuage(userService.getCurrentUserId());
		modelMap.addAttribute("menulist", menuService
				.getMenuByRoles(userService.getUserByAccountNumber(userService.getCurrentUserId()).getRole()));
		User user = userService.getUserByAccountNumber(userService.getCurrentUserId());
		user.setImage(SysConst.QNIUYUNURL + user.getImage());
		modelMap.addAttribute("user", user);
		modelMap.addAttribute("userLanguage", userLanguage);
		modelMap.addAttribute("title", chineseAndEnglishService.getPhraseByIndexAndLanguage(1, userLanguage));
		modelMap.addAttribute("role", chineseAndEnglishService.getPhraseByIndexAndLanguage(2, userLanguage));
		return "Home.ftl";
	}

}