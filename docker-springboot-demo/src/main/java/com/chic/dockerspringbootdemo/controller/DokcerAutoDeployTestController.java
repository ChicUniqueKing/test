package com.chic.dockerspringbootdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DokcerAutoDeployTestController {
	
	private static final Logger LOG = Logger.getLogger(DokcerAutoDeployTestController.class);
	
	
	@RequestMapping(value="docker")
	public String dockerTest(String name) {
		
		LOG.info("测试 logstash  docker ------------------"+name);
		return "docker start sucees";
		
	}
	
	@RequestMapping(value="test")
	public String testLogstash(HttpServletRequest request) {
		String name = request.getParameter("name");
		LOG.info("测试 logstash 日志收集 和kibana 展示功能 -----------");
		return "测试 logstash 日志收集 和kibana 展示功能 -----------"+name;
		
	}
	
	

}
