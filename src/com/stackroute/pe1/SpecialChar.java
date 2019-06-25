package com.stackroute.pe1;

import java.util.Scanner;

public class SpecialChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the character");
        char n = s.next().charAt(0);
        if ((n >= 65) && (n <= 90))
            System.out.println("Capital letters");
        else if ((n >= 97) && (n <= 122))
            System.out.println("Small letters");
        else if ((n >= 48) && (n <= 57))
            System.out.println("Numbers");
        else
            System.out.println("Special characters");
    }

}