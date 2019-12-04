package com.zhang.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhang.entity.Applicant;
import com.zhang.service.MyService;

@Controller
public class MyController {

	@Autowired
	private MyService service;
	//列表 修改了一行
	@RequestMapping("list")
	public Object list(HttpServletRequest request){
		List<Applicant> list = service.list();
		request.setAttribute("list", list);
		return "list";
	}
}
