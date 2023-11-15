package com.javacode_5thmarch_2023;

public class Post_increment {

	public static void main(String[] args) {
		int i= 1;
		int j= i++ + ++i;
		int k=j++ + i++ + ++j + j++;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);

	}

}
