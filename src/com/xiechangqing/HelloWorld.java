package com.xiechangqing;

public class HelloWorld {
	public static void main(String args[]){
		String result = getGrade(77);
		System.out.println("等级是"+result);
	}
	
	public static String getGrade(int score){
		String grade = "";
		if(score>=90&&score<=100){
			grade = "A等级";
		}else if(score>=70&&score<=89){
			grade = "B等级";
		}else if(score>=60&&score<=79){
			grade = "C等级";
		}else if(score>=0&&score<=59){
			grade = "D等级";
		}
		/*如果一个函数的返回值是具体的，那么该函数就必须在任意情况下都保证有返回值*/
		return grade;
	}
}
