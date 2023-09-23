import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //System.out.println(Arrays.toString(arr)); --> This only works on 1D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("   " + arr[i][j]);
            }
            System.out.println();
        }

        int[][] arr2D = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        System.out.println("Printing un equal number of columned array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print("   " + arr2D[i][j]);
            }
            System.out.println();
        }
    }
}
