package com.zhang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.zhang.entity.Applicant;

public interface MyMapper {

	@Select("select * from applicant")
	List<Applicant> list();

}
