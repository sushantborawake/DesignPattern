package com.scp.pizzahut;

abstract public class Pizza {
	int quantity;
	int price;
	String vegornonveg;

	public Pizza(int quantity, int price, String vegornonveg) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.vegornonveg = vegornonveg;
	}

	public abstract int getQuantity();

	public abstract long getprice();

	public abstract String getVegOrNonveg();

	@Override
	public String toString() {
		return "Pizza [getQuantity()=" + getQuantity() + ", getprice()=" + getprice() + ", getVegOrNonveg()="
				+ getVegOrNonveg() + "]";
	}

}

class Dominos extends Pizza {

	int quantity;
	int price;
	String vegornonveg;

	public Dominos(int quantity, int price, String vegornonveg) {
		super(quantity, price, vegornonveg);
		this.quantity = quantity;
		this.price = price;
		this.vegornonveg = vegornonveg;
	}

	@Override
	public int getQuantity() {
		return quantity;
	}

	@Override
	public long getprice() {
		return price;
	}

	@Override
	public String getVegOrNonveg() {
		return vegornonveg;
	}

}

class Macdonalds extends Pizza {

	int quantity;
	int price;
	String vegornonveg;

	public Macdonalds(int quantity, int price, String vegornonveg) {
		super(quantity, price, vegornonveg);
		this.quantity = quantity;
		this.price = price;
		this.vegornonveg = vegornonveg;
	}
	
	@Override
	public int getQuantity() {
		return quantity;
	}

	@Override
	public long getprice() {
		return price;
	}

	@Override
	public String getVegOrNonveg() {
		return vegornonveg;
	}

}

interface AbstractPizza {
	Pizza getPizzaBrand(int quantity,int price ,String vegornonveg);
}

class DominosFactory implements AbstractPizza {

	@Override
	public Pizza getPizzaBrand(int quantity,int price ,String vegornonveg) {
		//return getPizzaBrand(quantity, price ,vegornonveg);
		return new Dominos( quantity,price , vegornonveg);
	}

}

class MacDonaldsFactory implements AbstractPizza {

	@Override
	public Pizza getPizzaBrand(int quantity,int price ,String vegornonveg) {
		//return getPizzaBrand (quantity, price , vegornonveg);
		return new Macdonalds( quantity, price , vegornonveg);
	}

}

class PizzaFactory {
	public static Pizza getPizzaInstance(AbstractPizza pizza,int quantity,int price ,String vegornonveg) {
		return pizza.getPizzaBrand(quantity, price, vegornonveg);
	}
}
