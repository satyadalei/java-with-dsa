// Goal -- print all 3 digit armstrong numbers
// what is a armstrongNum =  153 ; 1^3 + 2^3 + 3^3 = 153 ;
//import java.lang.Math;
public class IsArmstrongNum {
    public static void main(String[] args) {
        int n  = 100 ;
        while (n < 1000){
            int num = n;
            //----------------- Method 1 ---------------
            // get all the digits
//                int num1, num2, num3; // in num1, num2, num3 all remainder will be stored
//                num = n; // quotient will be stored here in num
//
//                // divide 10 until quotient becomes 0
//                // let num = 325
//                num1 = num % 10 ; // num1 = 5
//                num = num /10 ;  // num = 32
//
//                num2 = num % 10; // num2 = 2
//                num  = num / 10;  // num = 3
//
//                num3 = num % 10 ; // num3 = 3
//                num =  num /10;   // num = 0
//
//                if (num1*num1*num1 + num2*num2*num2 + num3*num3*num3 == n){
//                    System.out.print(n + "  ");
//                }

               // --------- Method2 ----------------------
                int sum = 0 ;
                while (num != 0){
                    sum = sum + (int) Math.pow(num%10, 3); // Math
                    num = num / 10 ;
                }
                 if (sum == n){
                     System.out.print(n + "  ");
                 }
                // increment
                n++;
        }
    }
}
