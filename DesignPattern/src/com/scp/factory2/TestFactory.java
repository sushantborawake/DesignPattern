package com.scp.factory2;

import com.scp.factory2.Factory2.CarType;

public class TestFactory {

	public static void main(String[] args) {
Car c1=Factory2.getInstance(CarType.sedan,"fortuner","toyota",4000000);
System.out.println(c1);
Car c2=Factory2.getInstance(CarType.suv,"camry","toyota",3000000);
System.out.println(c2);
//Car c3=Factory2.getInstance(CarType.sedan);

//System.out.println(c3);


	}

}
