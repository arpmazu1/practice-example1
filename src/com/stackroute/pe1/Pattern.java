package com.stackroute.pe1;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=0;j<i;j++)

                System.out.print(i);

        }
    }
}
