package com.test1;

public class AddArea {
	public static void main(String[] args) {
		int param = getParam(2, 3, 3, 4, X->X, Y->Y);
		System.out.println(param);
	}
	
	public static int getParam(int a,int b,int l,int h,GetArea san,GetArea fan) {
		return san.getAllArea(a*b/3)+fan.getAllArea(l*h);
		
	}
}
