package com.scp.builderpattern;

import com.scp.builderpattern.Car.InnerCar;

public class TestMain {

	public static void main(String[] args) {
Car c1=new Car.InnerCar(1500, "toyoto", "fortuner").setAirBags(4).setCarType("suv").build();
	System.out.println(c1);
	}

}


class Car{

	int engineCC;
	String company;
	String modelName;//mandatory fields
	int airBags;
	String carType;//optional
	
	@Override
	public String toString() {
		return "InnerCar [engineCC=" + engineCC + ", company=" + company + ", modelName=" + modelName + ", airBags="
				+ airBags + ", carType=" + carType + "]";
	}
	
	public Car(InnerCar innerCar) {
		this.engineCC=innerCar.engineCC;
		this.company=innerCar.company;
		this.modelName=innerCar.modelName;
		this.airBags=innerCar.airBags;
		this.carType=innerCar.carType;
	}


	
static	class InnerCar{
	int engineCC;
	String company;
	String modelName;//mandatory fields
	int airBags;
	String carType;//optional

	
	
	
	public InnerCar(int engineCC, String company, String modelName) {
		super();
		this.engineCC = engineCC;
		this.company = company;
		this.modelName = modelName;
	}
	
	public InnerCar setAirBags(int airbags){
		this.airBags=airbags;
		return this;
		
	}
	
	public InnerCar setCarType(String cartype){
		this.carType=cartype;
		return this;
		
	}
	
	public Car build(){
		Car car=new Car(this);
		return car;
		
	}
}
}