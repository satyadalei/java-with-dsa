import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int num = 78.907f; --> this will give an error
        // type casting of float number into integer
//        int num = (int) (78.907f);
//        System.out.println(num);

//        int a = 157;
//        System.out.println("the num is");
//        byte b =(byte) (a); // returns -99
        //System.out.println(b);

//        byte m = 40;
//        byte n = 50;
//        byte o = 100;

//        int res = (m * n) /o ; // this will not give an error
//        System.out.println(res);

        //byte res = (m*n); // whenever there is an expression of byte java will automatically convert it to integer
        // you are storing that integer in a byte. This will give an error.

//        printing hello in different language
//        System.out.println("Hello");
//        System.out.println("नमस्ते");
//        System.out.println("你好");
//        System.out.println("привет");
//        System.out.println("ନମସ୍କାର");

        //printing characters into integer
//        int a = 'a';
//        System.out.println(a);
//        int charMe = 'A';
//        System.out.println(charMe);

        byte b = 42;
        char c  = 'a';
        short s = 1024;
        int i = 5000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i/c) - (d*s);
//      float + int = float
//      int/ char = integer like this . Higher value will be the result
        System.out.println(result);
        System.out.println(" (f*b)=" +(f*b) + ", (i/c)=" + (i/c) + ", (d*s) = " + (d*s));

    }
}
