// swapping two numbers of the array
import java.util.Arrays;

public class SwapArrayElements {
    public static void main(String[] args) {
        int[] arr = {5, 8, 23, 6};
        System.out.println(Arrays.toString(arr));
        swap(arr, 2,3);
        System.out.println("After swap");
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b){
        int middle =  arr[a];
        arr[a] = arr[b];
        arr[b] = middle;
    }
}
