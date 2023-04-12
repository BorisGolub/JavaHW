package class8;

public class E5WhileAndBreak {
    public static void main(String[] args) {

        // create a boolean variable summer, store true in it
        // write loop that runs as long as it is summer
        // inside the loop, check temperature if it is less than 100 print "it's good, I enjoy summer"
        // if temp exceeds 100 print "its very hot" and break loop with break keyword

        boolean summer = true;
        int temp = 85;
        while (summer) {
            if (temp < 100) {
                System.out.println("It's good, I enjoy summer");

            }else{
                System.out.println("It's very hot");
                break;
            }
            temp = temp+3;

        }
    }
}
