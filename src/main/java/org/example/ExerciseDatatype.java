package org.example;

import java.util.Scanner;

public class ExerciseDatatype {
    public static void main (String[] args){
        Scanner myScan = new Scanner(System.in);
        System.out.println("What is Your Mobile number? ");
         long number =  myScan.nextLong();
        System.out.println("What is your Id?" );
         int num = myScan.nextInt();
         System.out.println("Enter the initial ");
         char myChar = myScan.next().charAt(0);
         System.out.println( "Mobile number is " + number );
        System.out.println("Your Id is "+ num);
        System.out.println("My Initial is "+ myChar);
    }
}
