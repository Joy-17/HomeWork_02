package hw1;

public class HW_1 {

	public static void main(String[] args) {
		//1.
		int i1 = 12 ;
		int i2 = 6;
		System.out.println("12+6的和為:"+(i1+i2));
		System.out.println("12+6的積為:"+(i1*i2));
		
		
		//2.
		int egg = 200;
		System.out.println("共是"+(200/12)+"打"+(200%12)+"顆");
		
		//3.
		int sec = 256559;
		System.out.println((sec/60/60/24)+"天"+(sec/60/60%24)+"小時"+(sec/60%60)+"分"+sec%60+"秒");
		
		
		//4.
		final double pi = 3.1415;
		int radius =5;
		System.out.println("圓面積為:%.3d"+Math.pow(radius,2)*pi);
		System.out.println("圓周長為:%.3f"+radius*2*pi);
		
		//5.
		int pv = 1500000;
		double r = 0.02;
		
		int fv =(int)(pv*Math.pow((1+r),10));
		System.out.println("本金加利息共:"+fv+"元");
		
		//6.
		//5+5，兩者都是int類型，所以直接運算結果為10
		System.out.println(5+5);
		//5+'5'，由於'5'為char類型，以uniCode表裡面'5'的編號為53
		//53+5結果為58
		System.out.println(5+'5');
		//"5"為String類型，與5做串接，結果為55
		System.out.println(5+"5");
		
	}

}
