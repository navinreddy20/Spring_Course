package com.telusko.springmvcboot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.springmvcboot.model.Alien;

@Controller
public class HomeController
{
	@ModelAttribute
	public void modelData(Model m) 
	{
	m.addAttribute("name","Aliens");
	}
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	
	@RequestMapping("add")
	public String add(@RequestParam("num1")int i ,@RequestParam("num2") int j, Model m)
	{
		
	
		int num3 = i + j;
		
		m.addAttribute("num3",num3);
		
		return  "result";
		
	}
	
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute Alien a)
	{
		
	
		return "result";
		
	}
}
