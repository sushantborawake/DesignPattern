package com.scp.creational;

public class Student1 {
	// Static initialization
	private int studid;
	private String studnm;

	private static final Student1 s1;
	static {
		s1 = new Student1(1, "Sushant");
	}

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", studnm=" + studnm + "]";
	}

	private Student1(int studid, String studnm) {
		super();
		this.studid = studid;
		this.studnm = studnm;
	}

	public static Student1 getInstance() {
		return s1;
	}
}
