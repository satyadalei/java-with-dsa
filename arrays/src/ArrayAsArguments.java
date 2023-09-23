import java.util.Arrays;
import java.util.Scanner;

public class ArrayAsArguments {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        int[] nums = {2,5,8,9};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] numsArray){
        numsArray[0] = 99;
    }
}
