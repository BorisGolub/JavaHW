package class5;

import java.util.Scanner;

public class E3IfElse {
    public static void main(String[] args) {

        /*
        ask the user for their age, based on value of age write an if else condition
        if age is <18 print you cant drive
        otherwise you can drive
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("What is your age?");
        int age=scan.nextInt();
        if(age<18){
            System.out.println("you can not drive");

            System.out.println("error");

        } else {

            System.out.println("you can drive");
        }
    }
}
