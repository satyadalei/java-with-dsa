import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
           Syntax for Loops

           // ---------- For Loop --------------
           for(initialisation ; condition ; increment or decrement){
               // do what you want
           }
         */
//        for (int num = 1 ; num < 6 ; num += 1 ){
//            System.out.println( num +". Hello world!");
//        }


        /*
            Scanner in = new Scanner(System.in);
            System.out.println("Enter how many numbers you want to print : ");
            int num = in.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.print(" " + i + " ");
            }
        */

        //----------- While Loop ----------------------
       /*
            int num = 1;
            while (num < 5){
                System.out.print(" " + num + " ");
                num ++ ; // num = num + 1;
            }
        */


        // ------------ d0 while Loop -------------------
        int num = 1;
        do {
            System.out.println(num);
            num ++ ;
        }while (num < 5);


    }
}
