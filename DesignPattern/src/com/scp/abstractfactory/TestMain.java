package com.scp.abstractfactory;

public class TestMain {

	public static void main(String[] args) {
AbstractFactory factory=new MiFactory();
Mobile m1=MobileFactory.getMobileInstance(factory);
System.out.println(m1);
	}

}
