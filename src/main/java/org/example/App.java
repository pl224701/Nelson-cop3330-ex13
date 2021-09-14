
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
 */

package org.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        String str1 = sc.nextLine();
        System.out.print("What is the rate? ");
        String str2 = sc.nextLine();
        System.out.print("What is the number of years? ");
        String str3 = sc.nextLine();
        System.out.print("What is the number of times the interest is compounded per year? ");
        String str4 = sc.nextLine();
        Double n1 = Double.parseDouble(str1);
        Double n2 = Double.parseDouble(str2);
        Double n3 = Double.parseDouble(str3);
        Double n4 = Double.parseDouble(str4);
        n2=n2/100;
        double n5 = n3*n4;
        int n6 = (int)n5;
        Double n7 = n1*Math.pow(1+(n2/n4),n6);
        System.out.printf("%s invested at %s%% for %s years compounded %s times per year is %.2f",str1,str2,str3,str4,n7);
    }
}
