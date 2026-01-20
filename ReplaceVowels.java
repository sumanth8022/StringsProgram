package com.cg;

public class ReplaceVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="String";
		String s1="";
		s1 = str.replaceAll("[aeiouAEIOU]","");
		System.out.println("String after removing all the voewls : " + s1);

	}

}
