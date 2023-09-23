public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {
                {23,4,1},
                {98,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int ans = findMax(nums);
        System.out.println(ans);
    }
    static int findMax(int[][] nums){
        int max = nums[0][0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (max < nums[i][j]){
                    max = nums[i][j];
                }
            }
        }

        return max;
    }
}
