import java.util.Arrays;

//Find First and Last Position of Element in Sorted Array
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//leetcode -> https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FindFirstAndLastElementInSortedArray3 {
    public static void main(String[] args) {
       int[] nums = {5,7,7,7,7,7,8,8,9,9,9,10};
       int target = 7;
       int[] ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target){
        int start = 0 ;
        int end = nums.length - 1;
        boolean isNumExist = false;
        int[] ans = {-1,-1};

        // first I should check whether the target is already exists or not?
        while (start <= end){
            int middle = start + (end -start)/ 2 ;
            if (target > nums[middle]){
                start =  middle + 1;
            }
            if (target < nums[middle]){
                end =  middle - 1;
            }
            if (target == nums[middle]){
                isNumExist = true;
                break;
            }
        }

        //if exists find it otherwise return {-1,-1}
        if (isNumExist){
            start =  0;
            end = nums.length - 1;

            // find starting position
            while (start <= end){
                int middle = start + (end -start)/ 2 ;
                if (target > nums[middle]){
                    start =  middle + 1;
                }
                if (target <= nums[middle]){
                    end =  middle - 1;
                }
                // if (target == nums[middle]){
                //     end = middle - 1 ;
                // }
            }
            ans[0] = start;

            // find last position
            start =  0;
            end = nums.length - 1;
            while (start <= end){
                int middle = start + (end -start)/ 2 ;
                if (target >= nums[middle]){
                    start =  middle + 1;
                }
                if (target < nums[middle]){
                    end =  middle - 1;
                }
                // if (target == nums[middle]){
                //     start = middle + 1 ;
                // }
            }
            ans[1] = end;

            //return final ans
            return ans;
        }else{
            return ans;
        }
    }
}
