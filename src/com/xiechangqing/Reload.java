package com.xiechangqing;


/*
 	函数重载的要求：同时满足
 	1.函数名一致；
 	2.形参列表不一致（参数个数或者是类型不一致）；
 	3.与返回值类型是无关的
 */
class Reload {
	public static void main(String args[]){
		add(1,2);
		add(1,2,2);
	}
	
	public static void add(int a,int b){
		System.out.println("两个参数和"+(a+b));
	}
	
	public static void add(int a,int b,int c){
		System.out.println("三个参数和"+(a+b+c));
	}
}
