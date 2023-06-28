package org.example;

import java.util.Scanner;

/* ****************getting input from user ***************** */
public class inputdemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
  System.out.println("what is your name? ");
  String name = scanner.nextLine();
  System.out.println("What is your rating from 1 to 5?");
  int rating = scanner.nextInt();
  scanner.nextLine();
  System.out.println("Enter email ");
  String email = scanner.nextLine();
  System.out.println("hello " + name);
  System.out.println("you rated us " + rating);
  System.out.println("Email is " + email);
    }
}
