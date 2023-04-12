package class9;

public class E4Arrays {
    public static void main(String[] args) {

        /*
        create an array of strings, store 5 names in that array and then print all names
        from array with the help of for loop
        try printing with while loop as well
         */

        String[] names={"Boris","Milica","Nikola","Branka","Milan"};


        for(int j=0; j<names.length; j++) {
            System.out.print(names[j] + " ");
        }
        System.out.println();
        int counter=0;
        while(counter<names.length){
            System.out.print(names[counter]+" ");
            counter++;
        }

    }
}
