package com.stackroute.pe1;

import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int orig = n;
        int sum =0;
        int rev = 0;
        while(n>0) {
            int t = n % 10;
            rev = 10 * rev + t;
            if(t%2==0)
            sum +=t;
            n = n / 10;
        }
        if(orig==rev){
            System.out.println("Palindrome");
            if (sum>25)

                System.out.println("Sum is greater then 25");
            else
                System.out.println("Sum is smaller then 25");

        }
        else
            System.out.println("Not pallindrome");

    }
}
