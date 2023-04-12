package com.syntax.review;

public class AnotherNestedIF {
    public static void main(String[] args) {

        /*
        if you have a covid vaccine yes or no
        if dose=1 --> you need 2 to be fully vaccinated
        if dose=2 --> you are fully vaccinated
        if dose=3 --> you are fully vaccinated with booster
         */

        boolean vaccine = true;
        int dose = 5;

        if (vaccine) {
            if (dose == 1) {
                System.out.println("You need second dose");
            } else if (dose == 2) {
                System.out.println("You are fully vaccinated");
            } else if (dose == 3) {
                System.out.println("Fully vaccinated with booster");
            }else{
                System.out.println("you are not sheep");
            }


        }
    }
}