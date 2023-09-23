import java.util.Scanner;

// Goal - take one integer & detect whether it is armstrong or not
public class IsArmstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer to detect it armstrong or not : ");
        int num = in.nextInt();
        boolean isArmstrong = isArmstrong(num);
        System.out.println(isArmstrong);
    }
    static boolean isArmstrong(int num){
        int sum = 0 ;
        int a = num;
        while (a != 0){
            sum = sum + (int) Math.pow(a%10 , 3);
            a = a / 10 ;
        }

        return sum == num ;
    }
}
