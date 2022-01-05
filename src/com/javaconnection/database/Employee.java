package com.javaconnection.database;



public class Employee {


	
	private int EmpID;
	private String EmpName;
	private String EmpAge;
	private String EmpDob;
	private String EmpSalary;
	
	
	
	
	public int getEmpID() {
		return EmpID;
	}




	public void setEmpId(int EmpID) {
		this.EmpID = EmpID;
	}




	public String getEmpName() {
		return EmpName;
	}




	public void setEmpName(String EmpName) {
		this.EmpName = EmpName;
	}




	public String getEmpAge() {
		return EmpAge;
	}




	public void setEmpAge(String EmpAge) {
		this.EmpAge = EmpAge;
	}




	public String getEmpDob() {
		return EmpDob;
	}




	public void setEmpDob(String EmpDob) {
		this.EmpDob = EmpDob;
	}


	public String getEmSalary() {
		return EmpSalary;
	}




	public void setEmpSalary(String EmpSalary) {
		this.EmpSalary = EmpSalary;
	}

	




	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Employee(int id, String name, String dob, String age, String salary) {
		this.EmpID = id;
		this.EmpName = name;
		this.EmpDob = dob;
		this.EmpAge = age;
		this.EmpSalary = salary;
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Employee [EmpID=" + EmpID + ", EmpName=" + EmpName + ", EmpAge=" + EmpAge
				+ ", EmpDob=" + EmpDob+ ", EmpSalary="+EmpSalary+",+]";
	}
	
	
	
	
}

;