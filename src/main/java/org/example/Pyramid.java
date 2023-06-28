package org.example;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args){
        Scanner myNum = new Scanner(System.in);
        System.out.println("enter the number: ");
        int number = myNum.nextInt();
        System.out.println("enter the 3 digit number:");
        int number1 = myNum.nextInt();
        System.out.println("Enter the 5 digits number:");
        long number2 = myNum.nextLong();
        System.out.println("enter the 7 digit");
        long number3 = myNum.nextLong();
        System.out.println( "    "    + number +  "   ");
        System.out.println("   "   + number1 +  "  ");
        System.out.println("  "  + number2 + " ");
        System.out.println(" "+number3 +" ");

    }
}
