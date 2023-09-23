import java.util.Scanner;

public class LargestNumAmongThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max;
        // --- method 1 -----
          /*
            max = a
            if (max < b){
                max = b;
            }

            if (max < c){
                max = c;
            }
         */

        // method 2
         /*
           max = 0 ;
           if (a <= b){
                max = b;
            }else{
                max = a;
            }
            if (max < c ){
                max = c;
            }
         */

        // method 3
        max = Math.max(a,b);
        max = Math.max(max,c);
        System.out.println("the largest num is : " + max);

    }
}
