// Goal - Understanding about Arrays
public class Main {
    public static void main(String[] args) {
       // array syntax
        /*
           data_type[] variable_name = new data_type[size];
           or
           data_type[] variable_name = {data1,data2, data3, data4};
           left side -> declaration & right side -> initialisation
        */
        //int[] numbers = new int[5];
        //int[] rollNums = {1,2,3,7,10};
        //System.out.println(rollNums[0]);
        //System.out.println(numbers[0]); //returns 0

        String[] names = new String[5];
        System.out.println(names[0]); // null becoz no value has been initialised
    }
}