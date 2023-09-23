import java.util.Arrays;

//variable length arguments
public class VarArgs {
    public static void main(String[] args) {
       // func(6,89,90,23,4,5);
       // func(90,3);
        mulitple(2,5, "Satya","Kailash");
    }
    static void func(int ...ints){
        System.out.println(Arrays.toString(ints));
    }
    static void mulitple(int a, int b, String ...names){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(names));
    }
}
