package class7;

public class E9WhileLoop {
    public static void main(String[] args) {
        //print 25 20 15 10 5 using while loop

        int counter = 25;
        while (counter >= 5) {
            if (counter != 15) {
                System.out.print(counter + " ");

            }
            counter -= 5;
        }
    }
}
