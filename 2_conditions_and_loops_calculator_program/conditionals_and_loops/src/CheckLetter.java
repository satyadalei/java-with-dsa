import java.util.Scanner;

public class CheckLetter {
    public static void main(String[] args) {
        // scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char inputChar = input.next().charAt(0); // getting character

        /*
        int charValue = inputChar;
        // converting chara value into integer value -- Typecasting

        if (charValue >= 97 && charValue <= 122){
            // lower case
            System.out.println("It is a Lowercase character");
        }else if (charValue >= 65 && charValue <= 90){
            System.out.println("It is a Uppercase character");
        }else {
            System.out.println("Yo did not enter any alphabet");
        }
        System.out.println("Your entered character is : " + inputChar);
        */

        //without typecasting
        if (inputChar >= 'a' && inputChar <= 'z'){
            System.out.println("It is a Lowercase character");
        }else if (inputChar >= 'A' && inputChar <= 'Z'){
            System.out.println("It is a Uppercase character");
        }else{
            System.out.println("Yo did not enter any alphabet");
        }

    }
}
