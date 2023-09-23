public class CeilingOfANum {
    public static void main(String[] args) {
        int[] nums = {-12,-10,-7, 0, 6 , 8, 23, 45, 56,78};
        int target = 10 ;
        int ans = celingOfNum(nums,target);
        System.out.println(ans);
    }

    static int celingOfNum(int[] nums, int target) {
        int start = 0;
        int end  = nums.length - 1;
        // consider in ascending order first

        while (start <= end){
            int middle = start + (end - start)/2 ;
            if (target > nums[middle]){
                start = middle + 1;
            }
            if (target < nums[middle]){
                end = middle - 1 ;
            }

            if (target == nums[middle]){
                return middle;
            }
        }

        // it did not found the target - send celing
        return start;
    }
}
