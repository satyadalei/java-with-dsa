//Leetcode qsn -> https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
     // char[] letters = {'c','f','j'};
      char[] letters = {'x','x','y','y'};
      char target = 'z';
      char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0 ;
        int end = letters.length - 1;

        if (target > letters[end]){
            return letters[start];
        }

        while(start <= end){
            int targetValue = target;
            int middle = start + (end - start)/2 ; // index
            int middleValue = letters[middle]; // index value

            if(targetValue < middleValue){
                end = middle - 1;
            }
            if(targetValue > middleValue){
                start = middle + 1 ;
            }

            if(targetValue == middleValue){
                return letters[middle];
            }
        }
        return letters[start];
    }
}
