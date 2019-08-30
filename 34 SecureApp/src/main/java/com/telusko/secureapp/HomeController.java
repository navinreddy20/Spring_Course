package com.telusko.secureapp;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController 
{
	@RequestMapping("/home")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/login")
	public String loginPage()
	{
		return "login.jsp";
	}
	@RequestMapping("/logout-success")
	public String logoutPage()
	{
		return "logout.jsp";
	}
	@RequestMapping("user")
	@ResponseBody
	public Principal user(Principal principal)
	{
		return principal;
	}
	
}
