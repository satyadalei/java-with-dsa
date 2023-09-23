import java.util.Scanner;

public class StringArguments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = in.nextLine();
        String personalisedMsg = greetWithName(name);
        System.out.println(personalisedMsg);
    }

    static String greetWithName(String name) {
        return "Hello " + name;
    }
}
