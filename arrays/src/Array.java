import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers;
        // primitive array
        numbers = new int[]{8, 5, 67, 6, 90};
        //System.out.println("Enter 5 numbers : ");
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = in.nextInt();
//        }

        // method-- 1 using for loop
//        System.out.print("Your entered numbers : ");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }

        // method-- 2 another way of using for loop
//        for(int i : numbers){
//            System.out.println(i);
//        }

        // method - 3
        System.out.println(Arrays.toString(numbers));


    }
}
