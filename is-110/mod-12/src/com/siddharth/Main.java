package com.siddharth;

interface DogInterface{
    void eat();
}

abstract class Dog {
    public void bark(){
        System.out.println("Bark!");
    }

    public abstract void sitDown();
}

class PitBull extends Dog {
    public void sitDown(){
        System.out.println("Finding sofa and sitting down");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog pitbull = new PitBull();
        pitbull.bark();
    }
}
