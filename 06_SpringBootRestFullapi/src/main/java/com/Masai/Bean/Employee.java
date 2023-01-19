package com.Masai.Bean;

public class Employee {

	private Integer empId;
	private String name;
	private String add;
	private Integer salary;
	public Employee(Integer empId, String name, String add, Integer salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.add = add;
		this.salary = salary;
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
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", add=" + add + ", salary=" + salary + "]";
	}
	
	
	
}
