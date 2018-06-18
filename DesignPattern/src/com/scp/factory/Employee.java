package com.scp.factory;

 abstract public class Employee {
private int empid;
private String empnm;
private double salary;

@Override
public String toString() {
	return "Employee [empid=" + empid + ", empnm=" + empnm + ", salary=" + salary + "]";
}
abstract public int getEid();
abstract public String getEnm();
abstract public double getEsalary();

 }
 
 class Pemp extends Employee{
	 private int empid;
	 private String empnm;
	 private double salary;

	@Override
	public String toString() {
		return "Pemp [empid=" + empid + ", empnm=" + empnm + ", salary=" + salary + "]";
	}

	public Pemp(int empid, String empnm, double salary) {
		super();
		this.empid = empid;
		this.empnm = empnm;
		this.salary = salary;
	}

	@Override
	public int getEid() {
		return empid ;
	}

	@Override
	public String getEnm() {
		return empnm;
	}

	@Override
	public double getEsalary() {
		return salary;
	}
	 
 }
 
 class Cemp extends Employee{
	 private int empid;
	 private String empnm;
	 private double salary;
	 
	@Override
	public String toString() {
		return "Cemp [empid=" + empid + ", empnm=" + empnm + ", salary=" + salary + "]";
	}

	public Cemp(int empid, String empnm, double salary) {
		super();
		this.empid = empid;
		this.empnm = empnm;
		this.salary = salary;
	}

	@Override
	public int getEid() {
		return empid;
	}

	@Override
	public String getEnm() {
		return empnm;
	}

	@Override
	public double getEsalary() {
		return salary;
	}
	 
 }
 
 
 class Factory{
	 
	 public static Employee getInstance(EmpType type){
		 if(type.equals(EmpType.pemp)){
			 return new Pemp(1,"sushant",100000);
		 }else if(type.equals(EmpType.cemp)){
			 return new Cemp(2,"shraddha",20000);
		 }
		return null;
		 
	 }
	 enum EmpType{
		 pemp,cemp;
	 }
 }