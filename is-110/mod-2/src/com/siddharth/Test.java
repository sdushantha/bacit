package com.siddharth;

public class Test {
    private int age = 19;
    private boolean isHappy = false;
    private double piValue = 3.141;

    public Test(){
       isHappy = true;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void showMood(){
        if(isHappy){
            System.out.println("YAY i am happy");
        } else {
            System.out.println("Boo i am not happy");
        }
    }
}

