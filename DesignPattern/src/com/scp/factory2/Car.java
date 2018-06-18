package com.scp.factory2;

 abstract public class Car {
	 private String cname;
	 private String cvendor;
	 private int cprice;
	
@Override
	public String toString() {
		return "Car [cname=" + cname + ", cvendor=" + cvendor + ", cprice=" + cprice + "]";
	}
public abstract String carName();
public abstract String carVendor();
public abstract int carPrice();
}

 class Suv extends Car{
	 private String cname;
	 private String cvendor;
	 private int cprice;
	
	 
	@Override
	public String toString() {
		return "Suv [cname=" + cname + ", cvendor=" + cvendor + ", cprice=" + cprice + "]";
	}

	

	public Suv(String cname, String cvendor, int cprice) {
		super();
		this.cname = cname;
		this.cvendor = cvendor;
		this.cprice = cprice;
	}



	@Override
	public String carName() {
		return cname;
	}

	@Override
	public String carVendor() {
		return cvendor;
	}

	@Override
	public int carPrice() {
		return cprice;
	}
	 
 }
 
 
 class Sedan extends Car{
	 private String cname;
	 private String cvendor;
	 private int cprice;
	
	 
	@Override
	public String toString() {
		return "Sedan [cname=" + cname + ", cvendor=" + cvendor + ", cprice=" + cprice + "]";
	}

	
	public Sedan(String cname, String cvendor, int cprice) {
		super();
		this.cname = cname;
		this.cvendor = cvendor;
		this.cprice = cprice;
	}


	@Override
	public String carName() {
		return cname;
	}

	@Override
	public String carVendor() {
		return cvendor;
	}

	@Override
	public int carPrice() {
		return cprice;
	}
	 
 }
 
 
 class Factory2{
	 public static Car getInstance(CarType type,String cname,String cvendor,int cprice){
		 if(type.equals(CarType.sedan)){
			 return  new Sedan( cname, cvendor, cprice) ;
		 }
		 else if(type.equals(CarType.suv)){
			 return new Suv( cname, cvendor, cprice) ;
		 }
		 return null;
	 }
	 enum CarType{
		 suv,sedan;
	 }
 }
 
 