package com.cg;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "abbc";
		int n = str.length();
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			char  ch = str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}
			else {
				map.put(ch,1);
			}
		}
		
		
		for(int i=0;i<n;i++) {
			char ch = str.charAt(i);
			if(map.get(ch)==1) {
				System.out.print("First Non Repeating Character : ");
				System.out.println(ch +" >> " + map.get(ch));
				return;
				
			}
			
		}
		System.out.println("No non-repeating character found");
	}

}
