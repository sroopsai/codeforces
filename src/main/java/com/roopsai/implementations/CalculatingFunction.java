package com.roopsai.implementations;

import java.util.Scanner;

public class CalculatingFunction {

    public static long calculateFunction(long n) {
        if (n%2 == 0) return n/2;
        return ((n-1)/2 - (n));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(calculateFunction(n));
    }
}
