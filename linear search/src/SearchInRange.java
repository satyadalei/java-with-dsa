public class SearchInRange {
    public static void main(String[] args) {
        int[] nums ={4, 67, 89,45,67,123,89};
        // method 2 -- using forEach loop
        boolean ans =  check(nums, 89, 3,6);
        System.out.println(ans);
    }
    static boolean check(int[] nums,int target,int start, int end){
         if (nums.length == 0){
             return false;
         }
        for (int i = start; i <= end; i++) {
            if (nums[i] == target){
                return true;
            }
        }
        return false;
    }
}
