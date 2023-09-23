public class FindMinimu {
    public static void main(String[] args) {
        int [] nums = {12,-7, 67, 24, -456};
        int ans = findMin(nums);
        System.out.println(ans);
    }
    static int findMin(int[] nums){
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]){
                min = nums[i];
            }
        }
        return  min;
    }
}
