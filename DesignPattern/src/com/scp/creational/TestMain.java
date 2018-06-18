package com.scp.creational;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;



public class TestMain {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
			
	
		System.out.println("*******************by static********************");
		Student1 s3 = Student1.getInstance();
		Student1 s4 = Student1.getInstance();

		System.out.println(s3 == s4);
		System.out.println(s3);

		System.out.println("****************by lazy**************************8");

		Student3 s5 = Student3.getInstance();
		Student3 s6 = Student3.getInstance();

		System.out.println(s5 == s6);
		System.out.println(s5);

		System.out.println("****************threadsafe**************************8");

		Student4 s7 = Student4.getInstance();
		Student4 s8 = Student4.getInstance();

		System.out.println(s7 == s8);
		System.out.println(s7);

		System.out.println("****************doublly checked**************************");

		Student5 s9 = Student5.getInstance();
		Student5 s10 = Student5.getInstance();

		System.out.println(s9 == s10);
		System.out.println(s9);

		System.out.println("****************bill pugh**************************");

		Student6 obj1 = Student6.getInstance();
		Student6 obj2 = Student6.getInstance();

		System.out.println(obj1 == obj2);
		System.out.println(obj1);

		System.out.println("**********************Enum************************");
		EnumClass s20 =EnumClass.s1;
		EnumClass s21 =EnumClass.s1;
		System.out.println(s21==s20);
		
		
		
		System.out.println("********************reflection***********************");

		Constructor[] c=EnumClass.class.getConstructors();
		EnumClass s23=null;
		for (Constructor constructor : c) {
			constructor.setAccessible(true);
			 s23=(EnumClass) constructor.newInstance();
		}
		System.out.println(s21==s23);
		
	}

}


