package com.sharada.controllers;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class Employee {
	static int count = 0;
	int empId;
	String empName;
	EmpAddress empAddress;
	List<String> dependent;
	Set provident;
	Map<String, String> skills;
	private Properties property;

	public Properties getProperty() {
		return property;
	}

	public void setProperty(Properties property) {
		count++;
		this.property = property;
	}

	public Employee() {
		System.out.println("in default constructor");
	}

	public Employee(int empId, String empName, EmpAddress empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public EmpAddress getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(EmpAddress empAddress) {
		this.empAddress = empAddress;
	}

	public List<String> getDependent() {
		return dependent;
	}

	public void setDependent(List<String> dependent) {
		this.dependent = dependent;
	}

	public Set getProvident() {
		return provident;
	}

	public void setProvident(Set provident) {
		this.provident = provident;
	}

	public Map<String, String> getSkills() {
		return skills;
	}

	public void setSkills(Map<String, String> skills) {
		this.skills = skills;
	}

	/*
	 * @Override public String toString() { return "Employee [empId=" + empId +
	 * ", empName=" + empName + ", empAddress=" +empAddress.toString(); }
	 */
	@Override
	public String toString() {
		return "count=" + count + "Employee [empId=" + empId + ", empName="
				+ empName + ", empAddress=" + empAddress + ", dependent="
				+ dependent + ", provident=" + provident + ", skills=" + skills
				+ ", property=" + property + "]" + empAddress.toString();
	}

}
