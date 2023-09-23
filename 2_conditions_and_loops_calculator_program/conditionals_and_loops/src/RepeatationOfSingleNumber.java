import java.util.Scanner;

public class RepeatationOfSingleNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer number : ");
        int number = in.nextInt();
        System.out.println("Enter which digit's frequency you want to calculate : ");
        int digit = in.nextInt();
        String num_as_string = Integer.toString(number);
        String digit_as_string = Integer.toString(digit);

        int count = 0;
        // method 1
//        for (int i = 0; i < num_as_string.length(); i++) {
//            if (num_as_string.charAt(i) == digit_as_string){
//
//            }
//        }

        // method 2
        while (number > 0){ // by doing this the last number (or digit is left from checking so will check it after all this ends)
           int remainder =  number % 10;
           int quotient = number/ 10 ;
           if (remainder == digit){
               count++;
           }
           number = quotient;
        }
        System.out.println("Total occurrence " + count);
    }
}
