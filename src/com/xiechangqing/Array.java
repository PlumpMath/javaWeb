package com.xiechangqing;
import java.util.*;
class Array {
	/*
	  ������ͬһ���������͵ļ���container
	 ��������[] ������ = new ��������[���ݳ���];
	 ��ߣ� int[] arr  status an int Array,name is arr;
	 	  int: it means the container only can store the int type.
	 	  []:it means it's array method
	 	  arr:name of para
	 �ұߣ�new int[50];������һ������Ϊ50��int�����������
	 	new�������������Ĺؼ���
	 	int:��ʾ���������ֻ�ܴ洢int��������
	 	[]����ʾ����������
	 	50������������ܴ洢50�����ݡ����������
	
	����ĺô����Է��䵽���������ÿһ�����ݶ�����һ����ţ��������Ǳ꣬�±꣩
	
	�ֲ����������һ����������һ���������ڲ������ģ���ô�ñ������Ǿֲ�������
	��Ա��������Ա�������Ƕ����ڷ���֮�⣬��֮�ڡ�
	
		
	 ջ�ڴ棺�ֲ�����������һ�������Լ��������ڣ����ϻ���ڴ�����ʧ��
	 ���ڴ棺�洢�Ķ��Ƕ������ݡ�����һ����ʹ���꣬���������ϴ��ڴ�����ʧ�����ǵȴ����������������ڵĻ�������~
	�������ݣ��������ݣ�����8�г���Ļ����������ͣ�
	�������û���������ͱ��������ˣ����������ͳ�Ϊ��������
	
	������new�ؼ��ִ����Ķ���jvm�����ڶ��ڴ��п���һ���µĿռ䣬����һ���µĶ���
	
	 */
	public static void main(String[] args){
		/*int[] arr = new int[50];
		arr[0] = 10;
		arr[1] = 30;
		arr[2] = 50;
		arr[3] = 90;
		//������һ��length�����ԣ����Բ鿴���������
		System.out.println("�����������"+arr.length);
		//System.out.print("arr[2]:"+arr[2]);
		for(int i = 0;i<arr.length;i++){
			System.out.println("����"+(i+1)+"Ϊ��"+arr[i]);
		}*/
		
		/*int[] arr = new int[2];
		arr = null;
		//null�øñ�����Ҫ�����κεĶ��󡣲�Ҫ��¼�κε��ڴ��ַ��
		//arr[1] = 10;
		//���� ��ָ���쳣
		//ԭ���������ͱ���û��ָ���κζ��󣬶������˶������������ǵ����˶���ķ�����
		System.out.println(arr[1]);*/
		
		
		/*int[] arr = new int[4];
		arr[0] = 10;
		//����ֵԽ�硣�����˲����ڵĶ���
		System.out.print(arr[4]);*/
		
		
		/*
		 * ��̬��ʼ����
		 * ��������[] arr = new ��������[���鳤��];
		 * ��̬��ʼ����
		 * ��������[] arr = {para1,para2,....};
		 * */
		
		/*�������һ��ʼ ���Ѿ�ȷ�������ݵ�ʱ��ʹ�þ�̬��ʼ����
		����ʹ�ö�̬��ʼ����*/
		
		/*int[] arr = new int[50];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0;i<arr.length;i++){
			arr[i] = scanner.nextInt();
		}*/
		
		
		
		/*1.����һ������������һ��int���͵���������ҳ���������е����Ԫ�أ����ظ������ߡ�*/
		int[] arr = {12,134,155,6,5};	
		int maxNum = getMax(arr);
		//selectSort(arr); //ֱ������
		bubbling(arr);
		System.out.println("���ֵΪ"+maxNum);
	}
	
	/*�ҳ����ֵ*/
	public static int getMax(int[] arr){
		int max = arr[0];
		for(int i = 1;i<arr.length;i++){
			if(arr[i]>=max){
				max = arr[i];
			}
		}
		return max;
	}
	
	/*ѡ������*/
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
		System.out.println("��������Ϊ");
		for(int i = 0;i<arr.length;i++){
			System.out.println(": "+arr[i]+";");
		}
	}*/
	
	/*ð������*/
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
		System.out.println("��С�����ð������");
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
}
