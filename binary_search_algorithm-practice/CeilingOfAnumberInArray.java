// given a sorted array & a target then find its ceiling -> numbers are unique
public class CeilingOfAnumberInArray {
    public static void main(String[] args) {
        int[] nums = {4,6,8,9,12,45,78, 80,110};
        int target = 79;
        int ceilingIndex = findCeiling(nums,target);
        System.out.println(ceilingIndex);
    }

    static int findCeiling(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end-start)/2;

            // condition one
            if (nums[mid] == target){
                return mid;
            }
            //condition 2
            if (nums[mid] > target){
                end = mid -1 ;
            }
            // case 2
            if (nums[mid] < target){
                start = mid + 1;
            }
        }
        // at this point while loop has been broken & start holds the ceiling point & return that
        return start;
    }
}
