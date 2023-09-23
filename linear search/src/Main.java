public class Main {
    public static void main(String[] args) {
        int[] numbers = {24, 56, 67, 24, 13, 43, 1, 4};
        int ans = findNum(numbers, 43);
        System.out.println(ans);
    }
    static int findNum(int[] number, int targetNum){
        // taking integer number array & target num
        if (number.length != 0){
            for (int index = 0; index < number.length; index++) {
                if (number[index] == targetNum){
                    return index;
                }
            }
        }
        return  -1;
    }
}