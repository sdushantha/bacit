package com.siddharth;

public class Test {
    private int age;  //primitive type (4 bytes)
    private boolean isHappy;  //primitive type (1 bit)
    private char letter;  //primitive type (2 bytes)
    private String name; //object type

    public void showPrimitive() {
        System.out.println("Age (int): " + age);
        System.out.println("isHappy (boolean): " + isHappy);
        System.out.println("letter (char): " + "'" + letter + "'");
    }

    public void showObject() {
        System.out.println("name (String): " + name);
    }

    public void showAll() {
        showPrimitive();
        showObject();
    }
}
