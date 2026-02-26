package com.arya.learning.basics;

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = scanner.nextInt();

        double bill = calculateBill(units);

        System.out.printf("Total Bill: Rs. %.2f\n", bill);

        scanner.close();
    }

    public static double calculateBill(int units) {

        if (units < 0) {
            throw new IllegalArgumentException("Units cannot be negative");
        }

        if (units <= 100)
            return units * 5;

        if (units <= 200)
            return 100 * 5 + (units - 100) * 6;

        return 100 * 5 + 100 * 6 + (units - 200) * 7;
    }
}