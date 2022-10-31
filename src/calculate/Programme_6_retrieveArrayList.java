package calculate;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_retrieveArrayList {
    public static void main(String [] args){
        // Create a list and add some colours to the list
        List<String> list_String=new ArrayList<String>();
        list_String.add("Pink");
        list_String.add("Red");
        list_String.add("White");
        list_String.add("Blue");
        list_String.add("Light Pink");

        // Print the list
        System.out.println(list_String);
        // get the first and third element
        String element = list_String.get(0);
        // print first and third element
        System.out.println("First element: "+element);
        element = list_String.get(2);
        System.out.println("Third element: "+element);
    }
}
