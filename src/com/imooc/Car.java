package com.imooc;

public abstract class Car {
	private String name;
	private int price;
	private int peoplenum;
	private int goodsnum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPeoplenum() {
		return peoplenum;
	}
	public void setPeoplenum(int peoplenum) {
		this.peoplenum = peoplenum;
	}
	public int getGoodsnum() {
		return goodsnum;
	}
	public void setGoodsnum(int goodsnum) {
		this.goodsnum = goodsnum;
	}
	
	public abstract void show();

}
