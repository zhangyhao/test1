package com.zhang.entity;

import java.util.Date;

/**
 * 
 * @author zhuzg
 *
 */
public class Applicant {
	
	private Integer aid           ;
	private String aname         ;
	private String gender        ;
	private Date birthday      ;
	private String college       ;
	private String major         ;
	private int edu           ;
	private int degree        ;
	private Date created       ;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getEdu() {
		return edu;
	}
	public void setEdu(int edu) {
		this.edu = edu;
	}
	public int getDegree() {
		return degree;
	}
	public void setDegree(int degree) {
		this.degree = degree;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "Applicant [aid=" + aid + ", aname=" + aname + ", gender=" + gender + ", birthday=" + birthday
				+ ", college=" + college + ", major=" + major + ", edu=" + edu + ", degree=" + degree + ", created="
				+ created + "]";
	}
	
	
	
	
	
	
	
	

}
