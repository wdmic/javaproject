package com.imooc;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Car[] cars = {
			new PeopleCar("奥迪A4",500,4),
			new PeopleCar("马自达6",400,4),
			new PGCar("皮卡雪5", 500, 2, 253),
			new PGCar("皮卡雪6", 1060, 2, 520),
			new GoodsCar("松花江",400,400)
		};
		System.out.println("***欢迎使用答答租车系统***");
        System.out.println("租车请按1，退出请按其他键。");
        Scanner scanner1 = new Scanner(System.in);
        while(scanner1.nextInt()==1){
        	System.out.println("你可租车的类型及其价目表：");
        	System.out.println("序号"+"\t"+"车名"+"\t"+"载人量"+"\t"+"载货量"+"\t"+"价格");
        	for(int i=0;i<cars.length;i++) {
            	System.out.print((i+1)+"\t");
            	cars[i].show();
        	}
        	System.out.println("输入你要租车的数量：");
        	Scanner scanner2 = new Scanner(System.in);
        	int carnum = scanner2.nextInt();
        	Car[] arrs = new Car[carnum];
        	for(int j=0;j<carnum;j++) {
        		System.out.println("请输入您要租的第"+(j+1)+"辆车的序号：");
        		Scanner scanner3 = new Scanner(System.in);
        		arrs[j] = cars[scanner3.nextInt()-1];
        	}
        	System.out.println("请输入要租车的天数");
        	Scanner scanner4 = new Scanner(System.in);
        	int days = scanner4.nextInt();
        	System.out.println("您的账单:");
        	System.out.println("序号"+"\t"+"车名"+"\t"+"载人量"+"\t"+"载货量"+"\t"+"价格");
        	int money=0,peosum=0,goodsnum=0;
        	for(int i=0;i<arrs.length;i++) {
            	System.out.print((i+1)+"\t");
            	arrs[i].show();
            	money += arrs[i].getPrice();
            	peosum += arrs[i].getPeoplenum();
            	goodsnum += arrs[i].getGoodsnum();
        	}
        	System.out.println("总费用："+money*days+"\t"+"可载总人数："+peosum+"\t"+"可载货物："+goodsnum);
        	
        }
    }

}
