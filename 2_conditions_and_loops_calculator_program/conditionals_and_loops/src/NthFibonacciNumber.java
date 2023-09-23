import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Q: Find nth fibonacci number . First num = 0 & second num = 0;
        int firstNum = 0;
        int secondNum = 1;
        int nextNum ;
        System.out.print("Enter which positioned fibonacci number you want : ");
        int positionNum = input.nextInt();
        for (int i = 2 ; i <= positionNum ; i++){
            nextNum = firstNum + secondNum ;
            firstNum = secondNum ;
            secondNum = nextNum;
            if (i == positionNum){
                System.out.println("The " + i + "th fibonacci number is " + nextNum);
            }
        }
    }
}
