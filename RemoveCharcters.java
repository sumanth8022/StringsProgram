package com.cg;

public class RemoveCharcters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Gsuma7267";
		int n = str.length();
		String s = str.replaceAll("[^a-zA-Z]","");
System.out.println("The remaining string is : " + s);
	}

}
