package com.cg;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="maam";
		String rev = "";
		int n = str.length();
		for(int i=n-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		if(rev.equals(str)) {
			System.out.println(rev +" It is a Palindrome");
		}
		else {
			System.out.println(rev + " It is Not a Palindrome");
		}

	}

}
