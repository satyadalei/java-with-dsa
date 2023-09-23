// find array is whether in increasing or decreasing order - Given array is in sorted format
public class OrderAgnostic {
    public static void main(String[] args) {
        int[] nums1 = {4,6,8,9,12,45,78,110};
        int[] nums2 = {110,78,45,12,9,8,6,4};
        int[] nums3 = {4,4,4};

        int orderOfArray = findOrderOfArray(nums3);
        System.out.println(orderOfArray);
    }

    static int findOrderOfArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

//        if (nums[start] == nums[end]){
//            // all elements are same
//            return 0;
//        }
//        if(nums[start] > nums[end]){
//            // array is in decreasing order
//            return -1;
//        }
//        // increasing order
//        return 1;

// above codes can be replaced by predefined java function
        return Integer.compare(nums[end], nums[start]);
    }
}
