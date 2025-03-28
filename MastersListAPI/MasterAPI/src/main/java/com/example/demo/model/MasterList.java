package com.example.demo.model;

import jakarta.persistence.*;


@Entity
@Table(name = "master_list")
public class MasterList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String parentCode;
    private String parentName;
    private String name;
    private String plan;
    private String option;
    private String optionFrequency;
    private String subCategory;
    private String sector;
    private String benchmark;
    private int faceValue;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getParentCode() {
		return parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public String getOptionFrequency() {
		return optionFrequency;
	}
	public void setOptionFrequency(String optionFrequency) {
		this.optionFrequency = optionFrequency;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getBenchmark() {
		return benchmark;
	}
	public void setBenchmark(String benchmark) {
		this.benchmark = benchmark;
	}
	public int getFaceValue() {
		return faceValue;
	}
	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}
	@Override
	public String toString() {
		return "MasterList [id=" + id + ", parentCode=" + parentCode + ", parentName=" + parentName + ", name=" + name
				+ ", plan=" + plan + ", option=" + option + ", optionFrequency=" + optionFrequency + ", subCategory="
				+ subCategory + ", sector=" + sector + ", benchmark=" + benchmark + ", faceValue=" + faceValue + "]";
	}
	public MasterList(Long id, String parentCode, String parentName, String name, String plan, String option,
			String optionFrequency, String subCategory, String sector, String benchmark, int faceValue) {
		super();
		this.id = id;
		this.parentCode = parentCode;
		this.parentName = parentName;
		this.name = name;
		this.plan = plan;
		this.option = option;
		this.optionFrequency = optionFrequency;
		this.subCategory = subCategory;
		this.sector = sector;
		this.benchmark = benchmark;
		this.faceValue = faceValue;
	}
	public MasterList() {
		super();
		// this controster we wwill use for the getting the values of the fields and the use for the calling the functions which is call automatically 
	}
    
}
