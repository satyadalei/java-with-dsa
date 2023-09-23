import java.util.ArrayList;
import java.util.Objects;

public class EvenNumberOfDigitsInANumber {
    public static void main(String[] args) {
        int[] nums = {12,3452,232,61,7896, 1};
        //int ans =  giveEvenDigitNums(nums);
        //int ans =  noOfEvenNums(nums);
//        int ans =  noOfEvenNums2(nums);
        ArrayList<Integer> ans =  noOfEvenNums2(nums);
        for (int num : ans){
            System.out.print(num + " ");
        }
    }
    // method 1 -> Iterating to each number then counting each number's length by dividing 10
    static int giveEvenDigitNums(int[] nums){
        int evenCount = 0;
        for(int num : nums){
            int count = 0;
            while (num > 0){
                num = num / 10;
                count ++ ;
            }
            if (count % 2 == 0){
                evenCount++;
            }
        }

        return evenCount;
    }
    //method 2 -> converting to string
    static int noOfEvenNums(int[] nums){
        int count = 0;
        for(int num : nums){
           String numString = Integer.toString(num);
           if (numString.length() % 2 == 0){
               count++;
           }
        }
        return count;
    }
    //method - 3
    static ArrayList<Integer> noOfEvenNums2(int[] nums){
        ArrayList<Integer> newNums = new ArrayList<>();
        int count = 0;
        for (int num : nums){
            int ans = (int) Math.log10(num) + 1;
            System.out.println(" ans "+ ans);
            if (ans % 2 == 0){
                newNums.add(num);
                count++;
            }
        }
        return newNums;
    }


    // end of main function
}
