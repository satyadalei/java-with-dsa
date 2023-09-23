import java.util.Arrays;

//Find First and Last Position of Element in Sorted Array
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//leetcode -> https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FindFirstAndLastElementInSortedArray2 {
    public static void main(String[] args) {
       int[] nums = {5,7,7,7,7,7,8,8,9,9,9,10};
       int target = 10;
       int[] ans = {-1,-1};
       int start = searchRangeStart(nums,target,true);
       int end = searchRangeStart(nums,target,false);
       ans[0] = start;
       ans[1] = end;
        System.out.println(Arrays.toString(ans));
    }
    static int searchRangeStart(int[] nums, int target,boolean isStart){
        int start = 0 ;
        int end = nums.length - 1;
        boolean isNumExist = false;
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
            while (start <= end){
                int middle = start + (end -start)/ 2 ;
                if (target > nums[middle]){
                    start =  middle + 1;
                }
                if (target < nums[middle]){
                    end =  middle - 1;
                }
                if (isStart){
                    // sending starting position
                    if (target == nums[middle]){
                        end = middle - 1 ;
                    }
                }else{
                    // sending ending position
                    if (target == nums[middle]){
                        start = middle + 1 ;
                    }
                }
            }
            if (isStart){
                return start;
            }else{
                return end;
            }
        }else{
            return -1;
        }
    }
}
