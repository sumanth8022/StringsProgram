package com.cg;

public class FirstandLastLetterCaptilize {

    public static void main(String[] args) {

        String str = "prepinsta";

        // If string is empty
        if (str.length() == 0) {
            System.out.println(str);
            return;
        }

        // If string has only one character
        if (str.length() == 1) {
            System.out.println(str.toUpperCase());
            return;
        }

        char first = Character.toUpperCase(str.charAt(0));
        char last = Character.toUpperCase(str.charAt(str.length() - 1));

        String middle = str.substring(1, str.length() - 1);

        String result = first + middle + last;

        System.out.println(result);
    }
}
