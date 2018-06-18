package com.scp.creational;

public class Student5 {
	// doublly checked ThreadSafe
	private int studid;
	private String studnm;

	private static Student5 s1 = null;

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", studnm=" + studnm + "]";
	}

	private Student5(int studid, String studnm) {
		super();
		this.studid = studid;
		this.studnm = studnm;
	}

	public static Student5 getInstance() {
		if (s1 == null) {
			synchronized (Student5.class) {
				if (s1 == null) {
					s1 = new Student5(1, "satyam");
				}
			}
		}
		return s1;
	}

}
