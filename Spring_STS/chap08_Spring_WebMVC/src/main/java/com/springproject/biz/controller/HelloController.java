package com.springproject.biz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello.do")
	public ModelAndView hello() {
		//System.out.println("hello() 호출...");
		
		ModelAndView mav = new ModelAndView();
		// 키-값 형식으로 add
		mav.addObject("greeting", "Hello String");
		
		// present logic 설정에 정의된 prefix, suffix 설정으로 페이지 읽어옴
		// webapp/WEB-INF/views/hello.jsp를 읽어온다 (리다이렉트 아님)
		mav.setViewName("hello");
		
		return mav;
	}
}
