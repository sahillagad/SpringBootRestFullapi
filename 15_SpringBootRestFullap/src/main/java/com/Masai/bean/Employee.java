package com.Masai.bean;

public class Employee {

	private Integer empId;
	private String name;
	private Integer salary;
	private Department department;
	public Employee(Integer empId, String name, Integer salary, Department department) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public Employee() {
		super();
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ "]";
	}
	
	
}
