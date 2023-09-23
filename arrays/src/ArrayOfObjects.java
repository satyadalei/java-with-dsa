import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = new String[4];

        System.out.print("Enter 4 string : ");
        for (int i = 0; i < 4; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
