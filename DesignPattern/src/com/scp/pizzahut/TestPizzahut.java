package com.scp.pizzahut;

public class TestPizzahut {

	public static void main(String[] args) {
AbstractPizza pizza=new DominosFactory();
Pizza p2=PizzaFactory.getPizzaInstance(pizza ,2, 400,"chicken");
System.out.println(p2);
	}

}
