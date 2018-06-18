package com.scp.factory;

import com.scp.factory.Factory.EmpType;

public class TestMain {

	public static void main(String[] args) {

Employee e1=Factory.getInstance(EmpType.pemp);
Employee e2=Factory.getInstance(EmpType.cemp);
System.out.println(e1);
System.out.println(e2);
System.out.println(e1 instanceof Pemp);
System.out.println(e2 instanceof Pemp);
System.out.println(e1 instanceof Cemp);
System.out.println(e2 instanceof Cemp);
}
	
}
