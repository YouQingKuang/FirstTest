package com.test3;

public class Add2 {
	public static void main(String[] args) {
		
		AddTest2<Integer> getadd = (x,y)->x+y;
		
		//System.out.println(getadd.addTest(3, 5));
		
		
		getadd.addTest(5, 6);
	}
	
}
