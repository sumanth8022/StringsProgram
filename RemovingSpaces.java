package com.cg;

public class RemovingSpaces {

    public static void main(String[] args) {

        String str = "PRep Instat";
        int n = str.length();

        StringBuilder rem = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != '\t') {
                rem.append(str.charAt(i));
            }
        }

        System.out.println("After removing spaces: " + rem);
    }
}
