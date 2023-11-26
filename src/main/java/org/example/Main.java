package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input your value:");
        int userValue = scan.nextInt();


        try {
            System.out.println(SumCalculator.sum(userValue));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}