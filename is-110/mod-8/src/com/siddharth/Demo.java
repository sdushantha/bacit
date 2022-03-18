package com.siddharth;

public class Demo{
    private static int totalScore = 10;

    public static void showScore(){
        System.out.println(totalScore+3);
    }

    public static void showLevels(){
        // System.out.println("== Level 1 ==");
        // System.out.println("== Level 2 ==");
        // System.out.println("== Level 3 ==");
        // System.out.println("== Level 4 ==");
        // System.out.println("== Level 5 ==");

        String[] levels = {"Level 1", "Level 2", "Level 3", "Level 4", "Level 5"};

        for (String level: levels){
            System.out.println("== " + level + " ==");
        }

    }
}