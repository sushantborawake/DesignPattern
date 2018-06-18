package com.scp.creational;

public class Student4 {
	// Threadsafe
	private int studid;
	private String studnm;

	private static Student4 s1 = null;

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", studnm=" + studnm + "]";
	}

	private Student4(int studid, String studnm) {
		super();
		this.studid = studid;
		this.studnm = studnm;
	}

	public static synchronized Student4 getInstance() {
		if (s1 == null) {
			s1 = new Student4(1, "satyam");
		}
		return s1;
	}

}
