package com.cg.joinedtableinheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mgr_table")

public class Manager extends Employee{
	
	private String DepartmentName;

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
}	
