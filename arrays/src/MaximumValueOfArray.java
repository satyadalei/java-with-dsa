public class MaximumValueOfArray {
    public static void main(String[] args) {
        int[] arr = {117, 9, 10, 45, 36};

        int max  = maxim(arr);
        System.out.println("the maximum value is " + max);
    }

    static int maxim(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max ;
    }
}
