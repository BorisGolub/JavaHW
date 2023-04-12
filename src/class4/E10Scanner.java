package class4;

import java.util.Scanner;

public class E10Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("PLease enter your gender");
        // there is no direct method for the char data type in scanner class
        // always have 0 in ()
        // only one letter at a time
        char gender=scanner.next().charAt(5);
        System.out.println("you entered "+gender);

    }
}
