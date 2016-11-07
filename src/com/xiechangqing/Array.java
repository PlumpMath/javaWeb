package com.xiechangqing;
import java.util.*;
class Array {
	/*
	  数组是同一种数据类型的集合container
	 数据类型[] 变量名 = new 数据类型[数据长度];
	 左边： int[] arr  status an int Array,name is arr;
	 	  int: it means the container only can store the int type.
	 	  []:it means it's array method
	 	  arr:name of para
	 右边：new int[50];创建了一个长度为50的int类型数组对象
	 	new：创建数组对象的关键字
	 	int:表示该数组对象只能存储int类型数据
	 	[]：表示是数组类型
	 	50：该数组最多能存储50个数据。数组的容量
	
	数组的好处：对分配到数组对象中每一个数据都分配一个编号（索引，角标，下标）
	
	局部变量：如果一个变量是在一个方法的内部申明的，那么该变量就是局部变量。
	成员变量：成员变量就是定义在方法之外，类之内。
	
		
	 栈内存：局部变量。变量一旦出了自己的作用于，马上会从内存中消失。
	 堆内存：存储的都是对象数据。对象一旦被使用完，并不会马上从内存中消失，而是等待垃圾回收器不定期的回收垃圾~
	对象数据：引用数据（除了8中常规的基本数据类型）
	对象如果没有引用类型变量引用了，则这个对象就成为垃圾对象
	
	凡是以new关键字创建的对象，jvm都会在堆内存中开辟一个新的空间，创建一个新的对象
	
	 */
	public static void main(String[] args){
		/*int[] arr = new int[50];
		arr[0] = 10;
		arr[1] = 30;
		arr[2] = 50;
		arr[3] = 90;
		//数组有一个length的属性，可以查看数组的容量
		System.out.println("数组的容量："+arr.length);
		//System.out.print("arr[2]:"+arr[2]);
		for(int i = 0;i<arr.length;i++){
			System.out.println("数组"+(i+1)+"为："+arr[i]);
		}*/
		
		/*int[] arr = new int[2];
		arr = null;
		//null让该变量不要引用任何的对象。不要记录任何的内存地址。
		//arr[1] = 10;
		//报错 空指针异常
		//原因：引用类型变量没有指向任何对象，而访问了对象的属相或者是调用了对象的方法。
		System.out.println(arr[1]);*/
		
		
		/*int[] arr = new int[4];
		arr[0] = 10;
		//索引值越界。访问了不存在的东西
		System.out.print(arr[4]);*/
		
		
		/*
		 * 动态初始化：
		 * 数据类型[] arr = new 数据类型[数组长度];
		 * 静态初始化：
		 * 数据类型[] arr = {para1,para2,....};
		 * */
		
		/*如果程序一开始 就已经确定了数据的时候，使用静态初始化。
		否则，使用动态初始化。*/
		
		/*int[] arr = new int[50];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0;i<arr.length;i++){
			arr[i] = scanner.nextInt();
		}*/
		
		
		
		/*1.定义一个函数，接受一个int类型的数组对象，找出数组对象中的最大元素，返回给调用者。*/
		int[] arr = {12,134,155,6,5};	
		int maxNum = getMax(arr);
		//selectSort(arr); //直接排序
		bubbling(arr);
		System.out.println("最大值为"+maxNum);
	}
	
	/*找出最大值*/
	public static int getMax(int[] arr){
		int max = arr[0];
		for(int i = 1;i<arr.length;i++){
			if(arr[i]>=max){
				max = arr[i];
			}
		}
		return max;
	}
	
	/*选择排序*/
	/*public static void selectSort(int[] arr){
		for(int j = 0;j<arr.length-1;j++){
			for(int i = j+1;i<arr.length;i++){
				if(arr[j]<arr[i]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("数组排序为");
		for(int i = 0;i<arr.length;i++){
			System.out.println(": "+arr[i]+";");
		}
	}*/
	
	/*冒泡排序*/
	public static void bubbling(int[] arr){
		for(int j = 0;j<arr.length-1;j++){
			for(int i = 0;i<arr.length-1-j;i++){
				if(arr[i+1]<arr[i]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		System.out.println("从小到大的冒泡排序");
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
}
