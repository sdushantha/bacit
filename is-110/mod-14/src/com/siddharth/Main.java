package com.siddharth;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       while (true) {
           try {
               System.out.printf("Provide your age: ");
               int age = scanner.nextInt();
               System.out.println("You are " + age + " year old");
               break;
           }
           catch (InputMismatchException e) {
               scanner.next();
               System.out.println("That's not an integer, please try again");
           }
       }

    }
}