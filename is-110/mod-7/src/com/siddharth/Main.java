package com.siddharth;

public class Main{
    public static void main(String[] args){
        String[] fruits = {"apple", "banana", "coconut", "dates", "eggplant", "fig", "grapes"};

        String stopAt = "eggplant";

        System.out.println("There are " + fruits.length + " fruits");

        for (int i = 0; i<fruits.length; i++) {
            if (fruits[i].equals(stopAt)) {
                System.out.println("Sorry, we need to stop at " + stopAt);
                break;
            }
            System.out.println("Adding " + fruits[i] + " to basket");
        }

        int a = 6;
        int b = 12;
        String out = a==b ? "Yes":"No";
        System.out.println("IS 6 equal to 12?" + out);
    }
}
