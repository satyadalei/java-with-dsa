public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {4,2,7,8,1,3};
//        int[] nums = {1,2,3,7,8};
        int[] sortedArray = BubbleSort(nums);
    }
    static int[] BubbleSort(int[] nums){
        int arrayLength = nums.length;
        int start = 0;

        int upto = arrayLength;

        while (upto <= arrayLength && upto > 0){
            boolean isSwaped = false;
            for (int i = 1; i < upto; i++) { // imagine array length is greater than one
                if (nums[i] < nums[i-1]){
                    // swap number
                    int hold = nums[i];
                    nums[i] = nums[i-1];
                    nums[i-1]= hold;
                    isSwaped = true;
                }
            }

            if (isSwaped){
                upto--;
            }else{
                break;
            }

        }
        for (int num : nums) {
            System.out.println(num);
        }

        return nums;
    }
}
