import java.util.Scanner;

public class Question_IsPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check is Prime or not : ");
        int num  =  in.nextInt();
        boolean ans = isPrime(num);
        System.out.println(ans);
    }

    static boolean isPrime(int a){
        if (a <= 1){
            return false;
        }
        if (a < 4){
            return  true;
        }
        int c = 2;
        while ( c < a){
          if (a % c == 0){
              return  false;
          }
          c++;
        }
        return  true;
    }
}
