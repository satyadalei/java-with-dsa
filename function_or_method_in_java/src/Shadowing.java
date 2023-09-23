public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println("X = " + x); // 90
        int x; // declaration
        //ystem.out.println("after redefine x = " + x); // 40 --> will give error
        x = 40; // initialisation
        System.out.println("after redefine x = " + x); // 40
        printX(); // 90
    }
    static void printX(){
        System.out.println("X value from printX = " + x);
    }
}
