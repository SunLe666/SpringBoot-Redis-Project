package com.sunle.api;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sunle.entity.User;
import com.sunle.service.UserService;

@RestController
@RequestMapping("/user/v1/")
public class FundingUserApi {

	private static Logger logger = LoggerFactory.getLogger(FundingUserApi.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public User getUser(HttpServletRequest request) {
		User user = new User();
		logger.info("getUser  start");
		try {
			String code1 = request.getParameter("code1");
			user = userService.getUserByCode1(code1);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		logger.info("getUser end");
		return user;
	}
	
	@RequestMapping(value="/updateUser")
	public String updateUser(){
		User user = new User();
		user.setCode1("310214502");
		user.setUserEmail("sunle@gmail.com");
		user.setUserName("sunle");
		user.setId(Integer.parseInt("1"));
		try {
			userService.updateUser(user);
			logger.info("update userinfo success!!");
		} catch (Exception e) {
			logger.error("update userinfo fail", e.getMessage());
		}
		return null;
	}
	
}
