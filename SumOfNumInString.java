package com.cg;

public class SumOfNumInString {

    public static void main(String[] args) {

        String str = "4PREP2INSTA6";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                sum += (ch - '0');
            }
        }

        System.out.println("Sum of digits in the string: " + sum);
    }
}
