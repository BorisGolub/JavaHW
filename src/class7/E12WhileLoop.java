package class7;

public class E12WhileLoop {
    public static void main(String[] args) {
        // add all the numbers 1 to 10 and display result 55
        // fist write a loop from 1 to 10
        //create variable to hold the sum and add all numbers
        //to that variable in each iteration

        int counter=1;
        int sum=0;
        while(counter<=10){
            sum+=counter; // same as sum + counter
            counter++;
        }
        System.out.println(sum);
    }
}
