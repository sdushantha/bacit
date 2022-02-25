package com.siddharth;

public class Main {
    public static void main(String[] args) {
        FruitBasket myFruitBasket = new FruitBasket();

        myFruitBasket.addFruit("apple");
        myFruitBasket.addFruit("banana");
        myFruitBasket.addFruit("coconut");
        myFruitBasket.addFruit("dates");
        myFruitBasket.logMsg("Original fruit basket");

        myFruitBasket.addFruit("eggplant");
        myFruitBasket.addFruit("fig");
        myFruitBasket.addFruit("grapes");
        myFruitBasket.logMsg("Added \"eggplant\", \"fig\" and \"grapes\" to fruit basket");


        myFruitBasket.removeFruitByIndex(3);
        myFruitBasket.logMsg("Removed \"dates\" by index 3");

        myFruitBasket.removeFruitByName("banana");
        myFruitBasket.logMsg("Removed fruit by name \"banana\"");

        myFruitBasket.addFruitAtIndex("blueberry", 1);
        myFruitBasket.logMsg("Added \"blueberry\" at index 1");

        myFruitBasket.addFruitAfterNamedFruit("dragonfruit", "coconut");
        myFruitBasket.logMsg("Added \"dragonfruit\" after \"coconut\"");
    }
}
