package com.cg;

public class RemovingBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="{}{}()Tsrvdga";
		str=str.replaceAll("[{}()]","");
		System.out.println("Expression after removing the Brackets: " + str);
	}

}
