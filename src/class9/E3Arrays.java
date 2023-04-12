package class9;

public class E3Arrays {
    public static void main(String[] args) {

        double [] numbers={10.5,5.5,0.05,100.5,586,451,45,34.5,545,78,98,34};

        //numbers.length gives us the total count of elements in an array
        System.out.println(numbers.length);
        for(int j=0; j<numbers.length; j++){
            System.out.print(numbers[j]+"  ");
        }
    }
}
