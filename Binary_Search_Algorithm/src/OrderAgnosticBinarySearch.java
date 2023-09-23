// detect whether array in ascending order or descending order & then apply binary search
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] nums = {-12,-10,-7, 0, 6 , 8, 23, 45, 56,78};
        int[] nums2 = {78, 56, 45, 23, 8, 6, 0, -7, -10, -12};
        int target = -10;
        //int ans =  binarySearch(nums,target);
        int ans =  binarySearch(nums2,target);
        System.out.println(ans);
    }
    private static int binarySearch(int[] nums, int target) {
        // first find order
            //ascending order
            int start = 0 ;
            int end = nums.length - 1 ;

            boolean isAsc ;
            if (nums[0] < nums[nums.length-1]){
                isAsc = true;
            }else {
                isAsc = false;
            }

            while (start <= end){
                int mid = start + (end-start)/2 ;
                if (isAsc){
                    if (target > nums[mid]){
                        start =  mid + 1;
                    } else if (target < nums[mid]) {
                        end = mid - 1;
                    }else{
                        // ans
                        return mid;
                    }
                }else {
                    if (target > nums[mid]){
                        end =  mid - 1;
                    } else if (target < nums[mid]) {
                        start = mid + 1;
                    }else{
                        // ans
                        return mid;
                    }
                }
            }
            // target element did not found
            return  -1;


    }

    // repeating more
//    private static int binarySearch(int[] nums, int target) {
//        // first find order
//        if (nums[0] < nums[nums.length-1]){
//            //ascending order
//            int start = 0 ;
//            int end = nums.length - 1 ;
//
//            while (start <= end){
//                int mid = start + (end-start)/2 ;
//                if (target > nums[mid]){
//                    start =  mid + 1;
//                } else if (target < nums[mid]) {
//                    end = mid - 1;
//                }else{
//                    // ans
//                    return mid;
//                }
//            }
//            // target element did not found
//            return  -1;
//
//        }else{
//            // descending order
//            int start = 0 ;
//            int end = nums.length - 1 ;
//
//            while (start <= end){
//                int mid = start + (end-start)/2 ;
//                if (target > nums[mid]){
//                    end =  mid - 1;
//                } else if (target < nums[mid]) {
//                    start = mid + 1;
//                }else{
//                    // ans
//                    return mid;
//                }
//            }
//            // target element did not find
//            return  -1;
//        }
//    }
}
