import java.util.Arrays;

// you are given an infinite sorted array & you have to find whether a target number is found
// you can't use the .length method here
public class InfiniteArrayFindNum {
    public static void main(String[] args) {
       int[] nums = {5, 7, 9, 12, 15, 19, 21, 24, 28, 30, 35, 38, 43, 47,89,124};
       int target = 24;

       // first get the range
       int[] range = getNumRange(nums,target);
        System.out.println(Arrays.toString(range));

        // find if num exist using binary search
        int targetIndex = serachNum(nums, target, range);
        System.out.println(targetIndex);
    }
    static int[] getNumRange(int[] nums, int target){
        int start = 0;
        int end = 1;
        while (target > nums[end]){
            int newStart = end + 1 ;
            end = end + ((end - start + 1) * 2);
            start = newStart;
        }

        return new int[] {start, end};
    }
    static int serachNum(int[] nums, int target, int[] range){
        int start = range[0];
        int end = range[1];
        while (start <= end){
            int middle = start + (end - start)/2 ;
            if (target > nums[middle]){
                start = middle + 1 ;
            }
            if (target < nums[middle]){
                end = middle - 1;
            }
            if (target == nums[middle]){
                return middle;
            }
        }
        return -1;
    }
}
