package com.scp.abstractfactory;

abstract public class Mobile {
	
public abstract boolean isBluetooth();
public abstract double getPrice();
public abstract long getImei();
@Override
public String toString() {
	return "Mobile [isBluetooth()=" + isBluetooth() + ", getPrice()=" + getPrice() + ", getImei()=" + getImei() + "]";
}


}

class iphone extends Mobile{

	@Override
	public boolean isBluetooth() {
		return false;
	}

	@Override
	public double getPrice() {
		return 80000;
	}

	@Override
	public long getImei() {
		return 1111111111;
	}
	
}

class Samsung extends Mobile{

	@Override
	public boolean isBluetooth() {
		return true;
	}

	@Override
	public double getPrice() {
		return 30000;
	}

	@Override
	public long getImei() {
		return 99999999;
	}
	
}

class Mi extends Mobile{

	@Override
	public boolean isBluetooth() {
		return true;
	}

	@Override
	public double getPrice() {
		return 20000;
	}

	@Override
	public long getImei() {
		return 333333333;
	}
	
}

interface AbstractFactory{
	Mobile getMobile();
}

class iPhoneFactory implements AbstractFactory{

	@Override
	public Mobile getMobile() {
		return new iphone();
	}
	
}

class SamsungFactory implements AbstractFactory{

	@Override
	public Mobile getMobile() {
		return new Samsung();
	}
	
}

class MiFactory implements AbstractFactory{

	@Override
	public Mobile getMobile() {
		return new Mi();
	}
	
}

class MobileFactory{
	
	public static Mobile getMobileInstance(AbstractFactory factory){
		return factory.getMobile();
		
	}
	
}