package com.siddharth;

/**
 * This class is used to demonstrate the content learned in Module 4 in IS-110.
 *
 * @author Siddharth Dushantha
 * @version 2022.02.18
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Demo {
    public static String getRandomWord(String[] wordList) {
        /**
         * This method gets a random word from the provided String array.
         *
         * @param wordList    A String array which will be used to pick a random word
         * @returns           A random word
         */
        Random randomGenerator;
        randomGenerator = new Random();
        int index = randomGenerator.nextInt(wordList.length);
        return wordList[index];
    }

    public static HashMap getAnimalBabyNames() {
        /**
         * This method returns a HashMap containing animal names and the names of their babies
         *
         * @returns HashMap containing animal names (key) and the names of their babies (value)
         */
        HashMap<String, String> AnimalBabyNames = new HashMap<String, String>();

        AnimalBabyNames.put("Deer", "Fawn");
        AnimalBabyNames.put("Cheetah", "Cub");
        AnimalBabyNames.put("Boar", "Shoat");
        AnimalBabyNames.put("Alpaca", "Cria");

        return AnimalBabyNames;
    }

    private static int getSizeOfFruitBasket(HashSet<String> fruitBasket) {
        /**
         * This method gets the size of our fruit basket.
         *
         * This method is private because it used by the demonstrateHashSetMethods() method should
         * not be accessed by others when using this class.
         *
         * @param fruitBasket     HashSet which contains the fruits
         * @returns               The number fruits in the fruit basket
         */
        return fruitBasket.size();
    }

    public static void demonstrateHashSetMethods() {
        /**
         * This method deomstrate a few of the methods from the HashMap class
         */
        HashSet<String> fruitBasket = new HashSet<String>();
        fruitBasket.add("apple");
        fruitBasket.add("banana");
        fruitBasket.add("coconut");
        fruitBasket.add("dates");
        fruitBasket.add("eggplant");

        System.out.println("Our fruit basket with size " + getSizeOfFruitBasket(fruitBasket) + " fruits: "+ fruitBasket);

        fruitBasket.add("orange");
        System.out.println("Added 'orange' to fruit basket");

        fruitBasket.remove("coconut");
        System.out.println("Removed 'coconut' from fruit basket");

        fruitBasket.remove("apple");
        System.out.println("Removed 'apple' from fruit basket");

        System.out.println("Our final fruit basket with size " + getSizeOfFruitBasket(fruitBasket) + " fruits: "+ fruitBasket);
    }






}
