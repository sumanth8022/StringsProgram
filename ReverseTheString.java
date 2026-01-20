package com.cg;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="string";
		int n = str.length();
		String s1="";
		for(int i=n-1;i>=0;i--) {
			s1 = s1+str.charAt(i);
		}
		System.out.println("The Reverse of the String is : " + s1);

	}

}
