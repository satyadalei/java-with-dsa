import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] nums = {
                {1,2,3},
                {4,5},
                {6,7,8}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print("   " + nums[i][j]);
            }
            System.out.println();
        }
        System.out.println("Passing argument as in function");
        change(nums);
        for (int[] a : nums){
            System.out.println(Arrays.toString(a));
        }
    }
    static void change(int[][] twoDArr){
        // printing the same passed array
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < twoDArr[i].length; j++) {
//                System.out.print("   " + twoDArr[i][j]);
//            }
//            System.out.println();
//        }

        // modifying the passed array argument
        twoDArr[1][0] = 99;
        twoDArr[1][1] = 100;

    }
}
