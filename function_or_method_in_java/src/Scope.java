public class Scope {
    public static void main(String[] args) {
        int a = 7;
        int b = 8;

       // System.out.println("a = " + a); //
       // num();
        blockScope();
    }
    //functional scope - if a variable is declared inside a function then it is accessed within that function only. you can not access that variable in any other function. this is called functional scope
    static void num(){
        int num = 67;
        //System.out.println(a); // error a is not defined but defined in main function
        System.out.println(num);
    }
    // block scope - if a variable is already defined within a blocked scope you can not access that as well
    static void blockScope(){
        int a = 67;
        System.out.println(a);
        {
            a = 89; // you can modify the values inside it because a is already defined in its outer scope
            int b = 67;
        }
        System.out.println(a);
        //System.out.println(b); // error b is not defined in this scope
    }
}
