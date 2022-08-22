package com.cg.entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dept_master")
public class Department {


@Id
private int id;
private String name;
//@OneToMany(mappedBy="department",cascade=CascadeType.ALL)
@OneToMany(mappedBy="department",cascade=CascadeType.ALL)
private Set<Employee> employee= new HashSet<>();

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}




public Set<Employee> getEmployees() {
	return employee;
}

public void setEmployees(Set<Employee> employee) {
	this.employee = employee;
}
	
	public void addEmployee(Employee employee) {
		employee.setDepartment(this);
		this.getEmployees().add(employee);
		
	
}

}