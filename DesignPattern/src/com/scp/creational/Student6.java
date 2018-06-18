package com.scp.creational;

public class Student6 {
private int studid;
private String studnm;


@Override
public String toString() {
	return "Student6 [studid=" + studid + ", studnm=" + studnm + "]";
}
public Student6(int studid, String studn) {
	super();
	this.studid = studid;
	this.studnm = studn;
}


private static class StudInner{
	private static final Student6 obj=new Student6(10, "mona");
	
}
public static Student6 getInstance(){
	
	return Student6.StudInner.obj;
}
}
