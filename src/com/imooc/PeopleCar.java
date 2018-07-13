package com.imooc;

public class PeopleCar extends Car {
	
	public PeopleCar(String name,int price, int num) {
		setName(name);
		setPrice(price);
		setPeoplenum(num);
	}
	public void show() {
		System.out.println(getName()+"\t"+getPeoplenum()+"\t"+"-"+"\t"+getPrice());
	}

}
