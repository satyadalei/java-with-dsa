import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter employee Id : ");
        int emp_Id = in.nextInt();
        System.out.print("Enter employee department : ");
        String department = in.next();

        switch (emp_Id) {
            case 1 -> System.out.println("The employee is 1");
            case 2 -> System.out.println("The employee is 2");
            case 3 -> {
                System.out.println("The employee is 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management depart.");
                    case "HR" -> System.out.println("HR depart.");
                }
            }
            case 4 -> System.out.println("The employee is 4");
            default -> System.out.println("Enter a valid employee id");
        }
    }
}
