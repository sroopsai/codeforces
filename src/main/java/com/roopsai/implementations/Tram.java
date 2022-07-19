//package com.roopsai.implementations;

import java.util.Scanner;

public class Tram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stops = scanner.nextInt();
        int minimumCapacity = 0;
        int passengers = 0;
        for(int stop = 1; stop <= stops; stop++) {

            int exit = scanner.nextInt();
            int entry = scanner.nextInt();
            passengers += entry - exit;
            minimumCapacity = Math.max(minimumCapacity, passengers);
        }
        System.out.println(minimumCapacity);

    }
}
