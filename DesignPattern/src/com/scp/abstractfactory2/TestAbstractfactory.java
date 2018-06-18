package com.scp.abstractfactory2;

public class TestAbstractfactory {

	public static void main(String[] args) {

	}

}

abstract class Car{
	int price;
	String carname;
	String carcolor;
	
	public Car(int price, String carname, String carcolor) {
		super();
		this.price = price;
		this.carname = carname;
		this.carcolor = carcolor;
	}
	@Override
	public String toString() {
		return "Car [price=" + price + ", carname=" + carname + ", carcolor=" + carcolor + "]";
	}
	

}


class Tata extends Car{

	public Tata(int price, String carname, String carcolor) {
		super(price, carname, carcolor);
	}



}

class Mahindra extends Car{

	public Mahindra(int price, String carname, String carcolor) {
		super(price, carname, carcolor);
	}


	
}

interface AbstractCar{
	Car getCar(int price, String carname, String carcolor);
}

class TataFactory implements AbstractCar{

	@Override
	public Car getCar(int price, String carname, String carcolor) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}

class MahindraFactory implements AbstractCar{

	@Override
	public Car getCar(int price, String carname, String carcolor) {
		// TODO Auto-generated method stub
		return null;
	}



	
}

class AbstractFactory{
	
	}
