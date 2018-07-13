package com.imooc;

public class PGCar extends Car {
	
	public PGCar(String name,int price, int peonum, int goodsnum) {
		setName(name);
		setPrice(price);
		setPeoplenum(peonum);
		setGoodsnum(goodsnum);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"\t"+getPeoplenum()+"\t"+getGoodsnum()+"\t"+getPrice());
	}

}
