package com.stackroute.pe1;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        if((n>20)&&(n<30)){
            if(n%2==0)

                System.out.println("Jerry");
            else
                System.out.println("Tom");

        }
        else
            System.out.println("Not found");
    }
}
