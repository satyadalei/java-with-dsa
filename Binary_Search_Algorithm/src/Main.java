public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int[] nums = {-12,-10,-7, 0, 6 , 8, 23, 45, 56,78};
           //index   // 0,  1, 2, 3, 4,  5,  6,  7,  8, 9

        int target = 23;
        int ans =  binarySearch(nums,target);
        System.out.println(ans);
    }

    private static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = -1;
        while (start <= end){
            mid = (start + end ) / 2 ; // index of middle element
            if (target > nums[mid]){
                start = mid + 1;
            }else if(target < nums[mid]){
                end = mid-1;
            }else{
                // nums[mid] = target - ans
                return mid;
            }
        }

        return  -1;
    }

}