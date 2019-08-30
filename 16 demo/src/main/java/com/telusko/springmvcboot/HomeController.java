package com.telusko.springmvcboot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
	@RequestMapping("/")
	public String home()
	{
		return "index.jsp";
	}
	
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1")int i ,@RequestParam("num2") int j)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		int num3 = i + j;
		
		mv.addObject("num3",num3);
		
		return  mv;
		
	}
}
