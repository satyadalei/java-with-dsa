import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        greet();
//        sum();
        int sumResult = sum2();
        System.out.println(sumResult);
    }
   static void greet(){
        System.out.println("Hello! I am a function.");
    }
    static void sum(){
        // return type void
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = in.nextInt();
        System.out.println("Enter number 2");
        int num2 = in.nextInt();
        int sum = num1 + num2 ;
        System.out.println("The two numbers sum = " + sum);
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = in.nextInt();
        System.out.println("Enter number 2");
        int num2 = in.nextInt();
        return num1 + num2;
    }
}