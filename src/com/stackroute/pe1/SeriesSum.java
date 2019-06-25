package com.stackroute.pe1;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);

            System.out.println("Enter the numbers");
            int num, total = 0;
            while ((num = s.nextInt()) != 0) {
                if (num % 1 != 0) {

                    break;
                }
                total += num;
            }
            System.out.println("Sum of the numbers:" + total);
        }
        catch (Exception e) {
            System.out.println("Error: not a valid input");
        }
    }
}
