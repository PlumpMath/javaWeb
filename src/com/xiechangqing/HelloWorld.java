package com.xiechangqing;

public class HelloWorld {
	public static void main(String args[]){
		String result = getGrade(77);
		System.out.println("�ȼ���"+result);
	}
	
	public static String getGrade(int score){
		String grade = "";
		if(score>=90&&score<=100){
			grade = "A�ȼ�";
		}else if(score>=70&&score<=89){
			grade = "B�ȼ�";
		}else if(score>=60&&score<=79){
			grade = "C�ȼ�";
		}else if(score>=0&&score<=59){
			grade = "D�ȼ�";
		}
		/*���һ�������ķ���ֵ�Ǿ���ģ���ô�ú����ͱ�������������¶���֤�з���ֵ*/
		return grade;
	}
}
