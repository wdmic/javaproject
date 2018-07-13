package com.imooc;

public class GoodsCar extends Car {
	
	public GoodsCar(String name,int price, int num) {
		setName(name);
		setPrice(price);
		setGoodsnum(num);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"\t"+"-"+"\t"+getGoodsnum()+"\t"+getPrice());
	}

}
