import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = in.nextInt();
        int reverseNum = 0 ;
        while (number > 0){
            reverseNum = (reverseNum * 10) + (number % 10) ;
            number = number / 10 ;
        }
        System.out.println("The reverse number is : " + reverseNum);
    }
}
