package com.scp.emp;

public class TestMain extends Employee {
	 
	
public TestMain(int eid, String enm) {
		super(eid, enm);
	}
public Employee getEmployee(int eid,String enm){
	Employee e1=new Employee(111, "sushant");
	return e1;
}
	public static void main(String[] args) {
//Employee e1=new Employee(111, "sushant");
TestMain t1= new TestMain(11,"suraj ");
t1.getEmployee(11, "pragati");
System.out.println(t1);
	}

}

class Employee{
	int eid;
	String enm;
	
	public Employee(int eid, String enm) {
		super();
		this.eid = eid;
		this.enm = enm;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", enm=" + enm + "]";
	}
}