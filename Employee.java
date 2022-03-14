package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	String id;
	String empName;
	String empLang;
	
	public Employee(String id,String name,String language) {
		this.id=id;
		this.empName=name;
		this.empLang=language;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpLang() {
		return empLang;
	}

	public void setEmpLang(String empLang) {
		this.empLang = empLang;
	}
}
