package class4;

import java.util.Scanner;

public class E11Scanner {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        // if we want to take a complete line from user, we should use scanner.nextLine() method
        // only in String variable
        String sentence=scanner.nextLine();
        System.out.println(sentence);
    }
}
