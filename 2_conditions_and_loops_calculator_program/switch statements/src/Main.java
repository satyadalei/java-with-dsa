import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a fruit name : ");
//        String fruit = in.next();

        /*
        switch (fruit){
            case "Apple" :
                System.out.println("King of fruit");
                break;
            case "Mango" :
                System.out.println("Sweet fruit");
                break;
            case "Orange" :
                System.out.println("Rounded fruit");
                break;
            case "Grapes" :
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        } */

        // enhanced switch cases
//        switch (fruit) {
//            case "Apple" -> System.out.println("King of fruit");
//            case "Mango" -> System.out.println("Sweet fruit");
//            case "Orange" -> System.out.println("Rounded fruit");
//            case "Grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("Please enter a valid fruit");
//        }
        System.out.println("enter day");
        int day = in.nextInt();


        // benefit of not putting a break condition
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Week Day");
                break;
            case 6:
            case 7:
                System.out.println("Week end");
                break;
        }
        /*
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Week Day");
            case 6, 7 -> System.out.println("Week end");
        } */

        // no need to put break
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("enter a valid week number");
        }
    }
}