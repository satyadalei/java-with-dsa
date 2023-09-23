public class SwapNumbers {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;

        //swaping a number
        /*
            int temp = a;
            a = b;
            b  = temp;
            System.out.println("a = " + a + " b = " + b);
        */
        System.out.println("a = " + a + " b = " + b);
        swap(a,b);
        System.out.println("a = " + a + " b = " + b);
    }
    static void swap(int a, int b){
        int num = a;
        a = b;
        b = num;
        System.out.println("a = " + a + " b = " + b);

    }
}
