import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // we will build a calculator

        Scanner in = new Scanner(System.in);
        while (true){
            // everytime it should ask abut operator
            System.out.print("Enter the operator : ");
            char op = in.next().trim().charAt(0);
            float ans = 0;

            if (op == '+' || op == '-'|| op == '*' || op == '/' || op == '%'){
                System.out.print("Enter two numbers : ");
                float num1 = in.nextInt();
                float num2 = in.nextInt();
                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/'){
                    if (num2 != 0){
                        ans = num1 / num2;
                    }else{
                        System.out.println("num2 = 0. Can't calculate" );
                    }
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
                System.out.println("Ans = " + ans);
            }else if (op == 'x' || op == 'X'){
                break;
            }else{
                System.out.println("Not an valid operator");
            }
        }
    }
}
