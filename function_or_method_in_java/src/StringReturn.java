import java.util.Scanner;

public class StringReturn {
    public static void main(String[] args) {
        //String name = askName();
        //System.out.println(name);
        int res = sum(2,6);
        System.out.println(res);
    }
    static String askName(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        return in.nextLine();
    }
    //passing arguments
    static int sum(int a,int b){
        return a+b;
    }
}
