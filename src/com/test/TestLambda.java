package com.test;

import java.util.function.DoubleUnaryOperator;

public class TestLambda {
	public static void main(String[] args) {
		
		//System.out.println(addTest(5,3,(x,y)->x-y));
		
		DoubleUnaryOperator dou = x->x+1;
		System.out.println();
		
	}
	
	//处理参数
	public static int addTest(int x,int y,InterfaceTest func) {
		return func.addDemo(x+y,x-y);
	};
	
//	public static double addTest2(int x,int y,DoubleUnaryOperator duo) {
//		return duo.;
//		
//	}
	
	
}
