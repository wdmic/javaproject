package com.imooc;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Car[] cars = {
			new PeopleCar("�µ�A4",500,4),
			new PeopleCar("���Դ�6",400,4),
			new PGCar("Ƥ��ѩ5", 500, 2, 253),
			new PGCar("Ƥ��ѩ6", 1060, 2, 520),
			new GoodsCar("�ɻ���",400,400)
		};
		System.out.println("***��ӭʹ�ô���⳵ϵͳ***");
        System.out.println("�⳵�밴1���˳��밴��������");
        Scanner scanner1 = new Scanner(System.in);
        while(scanner1.nextInt()==1){
        	System.out.println("����⳵�����ͼ����Ŀ��");
        	System.out.println("���"+"\t"+"����"+"\t"+"������"+"\t"+"�ػ���"+"\t"+"�۸�");
        	for(int i=0;i<cars.length;i++) {
            	System.out.print((i+1)+"\t");
            	cars[i].show();
        	}
        	System.out.println("������Ҫ�⳵��������");
        	Scanner scanner2 = new Scanner(System.in);
        	int carnum = scanner2.nextInt();
        	Car[] arrs = new Car[carnum];
        	for(int j=0;j<carnum;j++) {
        		System.out.println("��������Ҫ��ĵ�"+(j+1)+"��������ţ�");
        		Scanner scanner3 = new Scanner(System.in);
        		arrs[j] = cars[scanner3.nextInt()-1];
        	}
        	System.out.println("������Ҫ�⳵������");
        	Scanner scanner4 = new Scanner(System.in);
        	int days = scanner4.nextInt();
        	System.out.println("�����˵�:");
        	System.out.println("���"+"\t"+"����"+"\t"+"������"+"\t"+"�ػ���"+"\t"+"�۸�");
        	int money=0,peosum=0,goodsnum=0;
        	for(int i=0;i<arrs.length;i++) {
            	System.out.print((i+1)+"\t");
            	arrs[i].show();
            	money += arrs[i].getPrice();
            	peosum += arrs[i].getPeoplenum();
            	goodsnum += arrs[i].getGoodsnum();
        	}
        	System.out.println("�ܷ��ã�"+money*days+"\t"+"������������"+peosum+"\t"+"���ػ��"+goodsnum);
        	
        }
    }

}
