package com.test2;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTest {
	
	public static void main(String[] args) {
		String [] str = {"new","have","we","delete"};
		//Arrays.sort(str, new MyCompareInterface());
		
		Comparator<String> myComp = (s1,s2)->Integer.compare(s1.length(), s2.length());
		Arrays.sort(str,myComp);
		
		System.out.println(Arrays.toString(str));
		
	}
	
	
}
