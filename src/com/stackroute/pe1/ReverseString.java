package com.stackroute.pe1;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the string");
        String name = s.nextLine();
        char[] c=name.toCharArray();
        for(int i=c.length-1;i>=0;i--)
        {
            System.out.print(c[i]);
        }
        System.out.println();
    }
}


