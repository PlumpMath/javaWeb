package com.xiechangqing;
import java.util.*;
public class ArrAPI {
	public static void main(String[] args){
		int[] arr = {12,56,21,87,11};
		
		
		Arrays.sort(arr);
		
		String shuzu = Arrays.toString(arr);
		
		System.out.println(shuzu);
		
		int index = Arrays.binarySearch(arr, 11);
		System.out.println(index);
		
		
		
	}
}
