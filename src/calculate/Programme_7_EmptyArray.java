package calculate;
/**
 * Write a Java program to test an array list is empty or not. Define array list with
 * underground tube names
 */

import java.util.ArrayList;
import java.util.List;

public class Programme_7_EmptyArray {
    public static void main(String [] args){
        // Create list of underground station name
        List<String> list_String = new ArrayList<String>();
        list_String.add("Jubilee");
        list_String.add("Bakerloo");
        list_String.add("Metroline");
        list_String.add("Distrcit ");
        list_String.add("Centarline");

        System.out.println("Origional array list :" + list_String);
        System.out.println("Checking the above array list is empty or not!" + list_String.isEmpty());
        list_String.removeAll(list_String);
        System.out.println("Array is after remove all elements " + list_String);
        System.out.println("Cheking the aboce array list is empty or not !" + list_String.isEmpty());
    }
}
