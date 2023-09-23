import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
//        int num1 = input.nextInt();
        float num1 = input.nextFloat();
        System.out.println("Enter second number");
//        int num2 = input.nextInt();
        float num2 = input.nextFloat();
//        int sum  = num1 + num2;
        float sum = num1 + num2 ;
        System.out.println("The sum of two number is : " + sum);
    }
}
