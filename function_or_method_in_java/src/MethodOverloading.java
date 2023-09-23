// function overloading --
/*
  -- if two functions have same name then either you must put arguments in such a way that both arguments order mismatch
*/
public class MethodOverloading {
    public static void main(String[] args) {
        run(7);
        run(10,9);
    }
    // changing number of arguments
    static void run(int a){
        System.out.println(a);
    }
    static void run(int b, int c){
        System.out.println("Two numbers are "+ b + " "+ c);
    }
    // changing the order of the arguments
    static void run(int a, String name){
        System.out.println(a);
        System.out.println(name);
    }
    static void run(String c, int b){
        System.out.println("Two numbers are "+ b + " "+ c);
    }
}
