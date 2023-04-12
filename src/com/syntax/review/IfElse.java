package com.syntax.review;

public class IfElse {
    public static void main(String[] args) {

        int age=18;
        if (age>=18){
            System.out.println("you can get a driver license");
        }else{
            System.out.println("you are too young to drive");
        }

        System.out.println(" ----------------------------------------");

        String expected="Best sellers";

        if (expected.equals("Best Sellers")){
            System.out.println("Test Pass");

        }else{
            System.out.println("Test Fail");
        }
    }
}
