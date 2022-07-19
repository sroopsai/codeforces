//package com.roopsai.implementations;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Presentw {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] presents = new int[n];
        for(int i = 0; i < n; i++) {
            presents[i] = scanner.nextInt();
        }
        int[] output = new int[n+1];
        for(int i = 0; i < n; i++) {
            output[presents[i]] = i+1;
        }
       for(int i = 1; i < output.length; i++) System.out.print(output[i] + " ");
       System.out.println();
    }
}
