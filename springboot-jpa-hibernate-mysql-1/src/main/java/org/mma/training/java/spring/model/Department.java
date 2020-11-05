package org.mma.training.java.spring.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Department {  // Child
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long deptId;
	private String name;
	private String manager;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Employee employee;
	
	public Department() {}

	public Department(String name, String manager, Employee employee) {
		super();
		this.deptId = deptId;
		this.name = name;
		this.manager = manager;
		this.employee = employee;
	}
	
	public Department(String name, String manager) {
		super();
		this.deptId = deptId;
		this.name = name;
		this.manager = manager;
	}

	public long getDeptId() {
		return deptId;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
