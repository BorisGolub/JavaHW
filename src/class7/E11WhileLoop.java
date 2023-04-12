package class7;

public class E11WhileLoop {
    public static void main(String[] args) {

        // print numbers 100 to 1
        // print even numbers from 20 to 100
        // print only odd numbers from 100 to 1
        int counter = 100;
        while (counter >= 1) {
            System.out.print(counter + " ");
            counter--;
        }

        int counter1=20;
        System.out.println();
        while(counter1<=100){
            System.out.print(counter1+" ");
            counter1+=2;
        }

        int counter3=100;
        System.out.println();
        while(counter3>=1){
            if(counter3%2==1){
            System.out.print(counter3+" ");
        }
            counter3--;
    }
    }
}