package com.siddharth;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] myWordList = {"rock", "paper", "scissors", "car", "boat", "cow", "sheep"};
        System.out.println("Random word: " + Demo.getRandomWord(myWordList) + "\n");


        System.out.println("Animal Baby Names");
        HashMap<String, String> animalBabyNames = Demo.getAnimalBabyNames();
        System.out.println("Raw HashMap: " + animalBabyNames);
        for (var entry: animalBabyNames.entrySet()) {
            String adultAnimal = entry.getKey();
            String babyAnimal = entry.getValue();
            System.out.println("A baby " + adultAnimal + "is called a " + babyAnimal);
        }

        System.out.println("\nDemonstrating HashMaps");
        Demo.demonstrateHashSetMethods();

        int a = 1;
        Integer aa = new Integer(a);

        Integer bb = 1;


    }
}
