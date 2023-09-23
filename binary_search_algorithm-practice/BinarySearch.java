public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {4,6,8,9,12,45,78,110};
        int target = 78;

        int targetIndex = searchTarget(nums,target);
        if (targetIndex == -1){
            System.out.println("Element did not found!");
        }else{
            System.out.println(targetIndex);
        }
    }

    static int searchTarget(int[] nums, int target) {
        int start =  0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end-start)/2 ;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid] > target){
                end = mid - 1;
            }
            if (nums[mid] < target){
                start = mid + 1;
            }
        }

        return  -1;
    }
}
