package class7;

import java.util.Scanner;

public class E13WhileLoop {
    public static void main(String[] args) {

        // ask user for a number then print all the numbers from 1 to that number
        Scanner scan = new Scanner(System.in);
        System.out.println("PLease enter any number greater than 1");
        int num= scan.nextInt();

        int counter=1;
        while(counter<=num){
            System.out.print(counter+" ");
            counter++;
        }

    }
}
