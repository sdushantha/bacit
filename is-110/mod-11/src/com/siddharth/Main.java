package com.siddharth;

class Animal {
    public static void makeSound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    String dogColor;
    public Dog(String color){
        dogColor = color;
    }

    public static void makeSound(){
        System.out.println("woof");
    }
}

class Cat extends Animal {
    public static void makeSound(){
        System.out.println("meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog brownDog = new Dog("brown");
        Dog blackDog = new Dog("black");

        brownDog.makeSound();
        blackDog.makeSound();

        Cat.makeSound();
    }
}
