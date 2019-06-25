package com.stackroute.pe1;

import java.util.Scanner;

public class SortEven {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int[] freq = new int[10];
        int sum=0;
        while (n> 0)
        {
            int d = n % 10;
            freq[d]++;
            n= n / 10;
            if(d%2==0)
                sum+=d;
        }
        int result = 0;
        for (int i = 9; i >= 0 ; i--)
        {
            if (freq[i] != 0)
            {
                result = i;
                freq[i]--;
                break;
            }
        }

        for (int i = 9 ; i >=0; i--){
            while (freq[i]-- != 0) {
                result = result * 10 + i;

            }}
        System.out.println(result);

        if (sum>15)

            System.out.println("False");
        else
            System.out.println("Sum is"+sum );
    }

}

