import java.util.Arrays;

public class ValueChangeByReference {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(nums));
        changeNum(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void changeNum(int[] numbers) {
        numbers[0] = 99;
    }
}
