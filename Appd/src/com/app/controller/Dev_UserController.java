package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojo.Dev_User;
import com.app.service.Dev_UserService;
import com.app.service.impl.Dev_UserServiceImpl;
@Controller
@RequestMapping("/dev")
public class Dev_UserController {
	@Autowired
   private Dev_UserService dev_UserService;
	@RequestMapping("/login")
	public String tz(){
		return "devlogin";
	}
	
	@RequestMapping("/dologin")
	public String login(HttpSession session,Model model,@RequestParam("devCode")String devCode,@RequestParam("devPassword")String devPassword){
	List<Dev_User> list=dev_UserService.selAll();
    System.out.println(devCode);
	for (Dev_User user : list) {
		if(user.getDevCode().equals(devCode)&&user.getDevPassword().equals(devPassword)){
			session.setAttribute("devUserSession",user);
	       return "developer/main";
		}
		else{
			model.addAttribute("error", "你的账号或者密码错误，请重新输入");
			return "devlogin";
		}
		
	}
	return "devlogin";
	}
	
	@RequestMapping("/logout")
	public String logout(){
		return "devlogin";
	}
	
	@RequestMapping("/flatform/main")
	public String BMS(){
		return "developer/main";
	}
	

	
	
	public Dev_UserService getDev_UserService() {
		return dev_UserService;
	}

	public void setDev_UserService(Dev_UserService dev_UserService) {
		this.dev_UserService = dev_UserService;
	}
}
