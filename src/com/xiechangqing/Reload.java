package com.xiechangqing;


/*
 	�������ص�Ҫ��ͬʱ����
 	1.������һ�£�
 	2.�β��б�һ�£������������������Ͳ�һ�£���
 	3.�뷵��ֵ�������޹ص�
 */
class Reload {
	public static void main(String args[]){
		add(1,2);
		add(1,2,2);
	}
	
	public static void add(int a,int b){
		System.out.println("����������"+(a+b));
	}
	
	public static void add(int a,int b,int c){
		System.out.println("����������"+(a+b+c));
	}
}
