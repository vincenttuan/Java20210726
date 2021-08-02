package com.study.day14.school;

import java.util.LinkedHashSet;

public class Student {
	private String name;
	private Integer age;
	private LinkedHashSet<Clazz> clazzs = new LinkedHashSet<>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public LinkedHashSet<Clazz> getClazzs() {
		return clazzs;
	}
	public void setClazzs(LinkedHashSet<Clazz> clazzs) {
		this.clazzs = clazzs;
	}
	
	public void addClazz(Clazz clazz) {
		clazzs.add(clazz);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", clazzs=" + clazzs + "]";
	}
	
	
	
	
}
