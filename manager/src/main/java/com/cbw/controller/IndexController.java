package com.cbw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index() {
		
		
		return "index";
		
	}
	
	//直接放过去
	@RequestMapping("login")
	public String login() {
		
		return "index";
		
	}
	
	
	/**
	 * 所有的请求都过去
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}

}
