package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number ");
        int number =scanner.nextInt();

        while (number != 10) {
            System.out.println("Try again");
            number=scanner.nextInt();
            }
        }

    }
