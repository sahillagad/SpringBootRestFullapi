package com.Masai.Bean;

public class Employee {
	
	private Integer empId;
	private String empName;
	private Integer age;
	private Address address;
	private Integer salary;
	public Employee(Integer empId, String empName, Integer age, Address address, Integer salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.address = address;
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
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", address=" + address
				+ ", salary=" + salary + "]";
	}
	
	
	
	
	

}
