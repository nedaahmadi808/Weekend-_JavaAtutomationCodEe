package com.javacode_11thmarch_2023;

public class SmallestBetween4DecimalNumbers {

	public static void main(String[] args) {
   
		double d1= 1.1;
		double d2= 1.3;
		double d3= 1.4;
		double d4= 2;
		if (d1<d2 && d1<d3&& d1<d4) {
			System.out.println("d1 is the smallest :" + d1);
		}else if (d2<d1 && d2<d3 &&d2<d4) {
			System.out.println("d2 is the smallest :" + d2);
		}else if (d3<d1 && d3<d2 && d3<d4) {
				System.out.println("d3 is the smallest: " + d3);
			}else if (d4<d1 && d4<d2 && d4<d3) {
				System.out.println("the smallest is :" + d4);
		}

				

	}

}
