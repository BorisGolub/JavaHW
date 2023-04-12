package class9;

public class E11Arrays {
    public static void main(String[] args) {

        /*
        There are two ways of creating arrays
        new int[5]; => create an array of int with size 5
         */
        int [] numbers= new int[5];
            numbers[2]=50; // store 50 on index 2
            numbers[0]=100;
            numbers[1]=45;
            numbers[3]=75;
            numbers[4]=55;
        for (int number : numbers) {
            System.out.println(number);

        }
    }
}
