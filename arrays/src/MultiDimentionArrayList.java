import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimentionArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList();
        System.out.println(list);

        // initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // assigning values
        for (int i = 0; i < 3; i++) { // you can not put 4 instead of 3 here becoz u have only initialised 3 arraylists & now you are adding 4th arraylists data without even creating in the main array list
            for (int j = 0; j < 3; j++) {
               list.get(i).add(j,in.nextInt());
            }
        }

        System.out.println(list);
    }
}
