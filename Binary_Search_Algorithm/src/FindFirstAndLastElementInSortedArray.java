import java.util.Arrays;

//Find First and Last Position of Element in Sorted Array
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//leetcode -> https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FindFirstAndLastElementInSortedArray {
    public static void main(String[] args) {
       int[] nums = {5,7,7,8,8,10};
       int target = 8;
       int[] ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target){
        int start = 0 ;
        int end = nums.length - 1;

        while (start <= end){
            int middle = start + (end -start)/ 2 ;
            if (target > nums[middle]){
                start = middle + 1 ;
            }
            if (target < nums[middle]){
                end = middle - 1;
            }
            if (target == nums[middle]){
                if (nums.length == 1){
                    return new int[] {start, end};
                }
                end =  middle ;
                int j = end ; // that will be updated to stop loop for ending indexes

                start =  middle;
                int i = start ;// that will be updated to stop loop for starting indexes
                while (nums[i] == target){
                    if(i- 1 != 0){
                        if (nums[start-1] == target){
                            start--;
                        }
                        i--;
                    }else {
                        break;
                    }
                }

                while (nums[j] == target){
                    // reaching to end
                    if(j + 1 != nums.length - 1 ){
                        if (nums[end+1] == target){
                            end++;
                        }
                        j--;
                    }else{
                        break;
                    }
                }

                return new int[] {start, end};
            }
        }
        return new int[] {-1,-1};
    }
}
