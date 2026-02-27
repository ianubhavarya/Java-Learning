package com.arya.learning.loops;

import java.util.Scanner;
public class LoopProgram {

    public static void main(String[] args) {

        // 1️⃣ FOR LOOP
        System.out.println("FOR LOOP:");
        for(int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }


        // 2️⃣ WHILE LOOP
        System.out.println("\nWHILE LOOP:");
        int j = 1;
        while(j <= 5) {
            System.out.println("j = " + j);
            j++;
        }


        // 3️⃣ DO-WHILE LOOP
        System.out.println("\nDO-WHILE LOOP:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while(k <= 5);


        // 4️⃣ ENHANCED FOR LOOP (For-each loop)
        System.out.println("\nENHANCED FOR LOOP:");
        int[] numbers = {10, 20, 30, 40, 50};

        for(int num : numbers) {
            System.out.println("Number = " + num);
        }

    }
}