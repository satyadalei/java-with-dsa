import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float tempC;
        System.out.print("Enter temperature in celsius : ");
        tempC = in.nextFloat();
        float tempF = ( tempC * 9/5 ) + 32 ;
        System.out.println(tempC +" degree celsius in fahrenheit is = " + tempF);
    }
}
