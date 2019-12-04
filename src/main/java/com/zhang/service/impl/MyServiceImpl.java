package com.zhang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhang.dao.MyMapper;
import com.zhang.entity.Applicant;
import com.zhang.service.MyService;
@Service
public class MyServiceImpl implements MyService{

	@Autowired
	private MyMapper m;
	
	@Override
	public List<Applicant> list() {
		// TODO Auto-generated method stub
		return m.list();
	}

}
