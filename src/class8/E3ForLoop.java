package class8;

public class E3ForLoop {
    public static void main(String[] args) {

        // write a loop to add all the even numbers from 1 to 30

        int sum=0;
        for (int i = 1; i <=10; i++) {

            if(i%2==0){
                sum=sum+i; // sum+=i
            }
        }
        System.out.println(sum);

    }
}
