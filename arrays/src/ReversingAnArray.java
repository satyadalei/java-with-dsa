// Goal --> reverse array elements
import java.util.Arrays;

public class ReversingAnArray {
    public static void main(String[] args) {
        int[] arr1 = {4, 8, 9, 23, 67, 56};
        int[] arr2 = {7, 9, 10, 45, 36};
        System.out.println("---------------- Even Array -------------------");
        System.out.println(Arrays.toString(arr1));
        reverse(arr1);
        System.out.println("After reverse");
        System.out.println(Arrays.toString(arr1));

        System.out.println("---------------- Odd Array -------------------");
        System.out.println(Arrays.toString(arr2));
        reverse(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    static void reverse(int[] arr){
        int n = arr.length - 1; // index of last element of array
        // check even or odd
        int middle;
        if (n%2 == 0) {
            // even array
            for (int i = 0; i < (arr.length/2); i++) {
                int hold = arr[i]; // starting array element
                // swap
                arr[i] = arr[n];  // n = index of last element
                arr[n] = hold;
                n--;
            }
        }else{
            // odd array
            for (int i = 0; i < ((arr.length - 1)/2); i++) {
                int hold = arr[i]; // starting array element
                // swap
                arr[i] = arr[n];  // n = index of last element
                arr[n] = hold;
                n--;
            }
        }
    }
}
