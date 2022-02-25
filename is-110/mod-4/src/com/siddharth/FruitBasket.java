package com.siddharth;

import java.util.ArrayList;
import java.util.Iterator;

public class FruitBasket{
    private ArrayList<String> fruits;

    public FruitBasket(){
        fruits = new ArrayList<>();
    }

    public void logMsg(String message){
        System.out.println("== " + message + " ==");
        System.out.println(fruits + "\n");
    }

    public void addFruit(String fruit){
        fruits.add(fruit);
    }

    public void removeFruitByName(String fruit){
        fruits.remove(fruit);
    }

    public void removeFruitByIndex(int index){
        fruits.remove(index);
    }

    public void addFruitAtIndex(String fruit, int index) {
        fruits.add(index, fruit);
    }

    public void addFruitAfterNamedFruit(String fruit, String namedFruit) {
        Iterator<String> it = fruits.iterator();
        int count = 1;
        while (it.hasNext()) {
            if (it.next().equals(namedFruit)) {
                fruits.add(count, fruit);
                break;
            }
            count++;
        }

    }

}
