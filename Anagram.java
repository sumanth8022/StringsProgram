package com.cg;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="cat";
		String s2 = "tac";
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		for(int i=0;i<s2.length();i++) {
			char ch = s2.charAt(i);
			if(!map.containsKey(ch)) {
				System.out.println("Not a Anagram");
				return;
			}
			else {
				map.put(ch, map.get(ch)-1);
			}
		
		}
		for(int value : map.values()) {
			if(value!=0) {
				System.out.println("Not Anagram");
				return;
			}
		}
		System.out.println("Anagram");

	}

}
