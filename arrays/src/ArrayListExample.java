import java.util.ArrayList;
import java.util.Scanner;

// main goal -> If we do not know what are the size of the array then we can use
// arrayList
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        // 1st - What is a wrapper class
        ArrayList<Integer> list  = new ArrayList<>(5);
        // adding elements to the array
        list.add(56);
        list.add(12);
        list.add(67);
        list.add(89);
        list.add(100);
        list.add(1567);

        // printing array elements
        System.out.println(list);

        // getting the size of the arrayList
        System.out.println(list.size());

        // updating the array elements
        list.set(0,786);
        System.out.println(list);

        // removing an element
        list.remove(1);

        // getting the size of arrayList
        System.out.println(list.size());

        System.out.println();
        System.out.println("Printing all elements using for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // enhanced for loop
        for (Integer value : list) {
            System.out.print( value + " ");
        }
        list.clear();
        // Iteration of arraylist
        System.out.println("For Iteration please enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            list.add(i, in.nextInt());
        }

        // updated value
        System.out.println("Updated value");
        for (Integer integer : list){
            System.out.print(integer + " ");
        }

    }
}
