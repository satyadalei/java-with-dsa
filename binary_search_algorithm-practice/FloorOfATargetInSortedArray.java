//you are given a sorted array & a target then you have to find floor of the number
public class FloorOfATargetInSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,6,8,9,12,45,78, 80,110};
        int target = 10;
        int floorIndex = findFloor(nums,target);
        System.out.println(floorIndex);
    }

    static int findFloor(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start<= end){
            int mid = start + (end-start)/2;
            // case1
            if (nums[mid] == target){
                return mid;
            }
            //case 2
            if (nums[mid] > target){
                end = mid - 1;
            }
            //case 3
            if (nums[mid] < target){
                start = mid+1;
            }
        }
        return end;
    }
}
