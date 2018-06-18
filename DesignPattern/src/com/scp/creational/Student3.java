package com.scp.creational;

public class Student3 {
	// lazy initialization
	private int studid;
	private String studnm;

	private static Student3 s1 = null;

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", studnm=" + studnm + "]";
	}

	private Student3(int studid, String studnm) {
		super();
		this.studid = studid;
		this.studnm = studnm;
	}

	public static Student3 getInstance() {
		if (s1 == null) {
			s1 = new Student3(1, "satyam");
		}
		return s1;
	}

}
