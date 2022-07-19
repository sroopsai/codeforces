package com.roopsai.implementations;


import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        //String output;
        int uppercase = 0;
        int lowercase = 0;
        for (char ch : input.toCharArray()) {
            uppercase += Character.isUpperCase(ch) ? 1 : 0;
            lowercase += Character.isLowerCase(ch) ? 1 : 0;
        }
        if (lowercase >= uppercase) System.out.println(input.toLowerCase());
        else System.out.println(input.toUpperCase());
    }
}
