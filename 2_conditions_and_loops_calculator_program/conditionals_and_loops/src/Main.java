import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
             syntax of if statement
             if(some expression either true or false){
                // do something
             }else{
                // do other thing
             }
          */
        Scanner input = new Scanner(System.in);
        int salary;
        System.out.print("Enter your salary : ");
        salary = input.nextInt();
        // single if-else statement
//        if(salary > 10000){
//            salary = salary + 2000;
//        }else {
//            salary = salary + 1000;
//        }

        // multiple if-else-statement
        if( salary > 10000  && salary <= 20000){
            salary += 2000; // salary = salary + 2000;
        } else if (salary > 20000 && salary <= 30000) {
            salary += 5000;
        }else if (salary > 30000){
            salary += 10000;
        }else{
            salary += 1000;
        }

        System.out.println("Your salary is : " + salary);



    }
}