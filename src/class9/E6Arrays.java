package class9;

public class E6Arrays {
    public static void main(String[] args) {
        /*
        create and array and store 10,50,60,45,100 then print elements which are present on odd indexes
        expected output should be 50 45
         */
        int [] numbers={10,50,60,45,100};
        for (int i = 0; i < numbers.length; i++) {
            if(i%2 !=0){

                System.out.println(numbers[i]);
            }

        }

    }
}
