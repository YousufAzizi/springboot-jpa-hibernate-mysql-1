package org.mma.training.java.spring.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee { // Parent
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long empId;
	
	private String firstname;
	private String lastname;
	private String manager;
	
	@OneToOne(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
	private Department department;
	
	//no arg constructor
	public Employee() {
	
	}
	// field constructor
	public Employee(String firstname, String lastname, String manager, Department department) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.manager = manager;
		this.department = department;
	}
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public long getId() {
		return empId;
	}
	
	public void setId(long empId) {
		this.empId = empId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}


}
