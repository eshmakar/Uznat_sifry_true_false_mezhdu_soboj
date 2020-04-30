package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalArgumentException {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите значение х:");
            long x = scanner.nextLong();
            System.out.println("Введите значение у:");
            long y = scanner.nextLong();

            System.out.print(x + " & " + y + " = ");
            System.out.println(x & y);
            System.out.print(x + " | " + y + " = ");
            System.out.println(x | y);
            System.out.println();
        }
    }
}