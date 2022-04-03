package com.siddharth;

public class Mouse1 extends GenericMouse{
    public static void setColor(String color) {
        System.out.println(color);
    }

    public static void  leftClick(String abc){
        System.out.println("Subclass click");
    }
}
