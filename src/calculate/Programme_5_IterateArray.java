package calculate;

import javax.naming.Name;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */
public class Programme_5_IterateArray {

        public static void main (String [] args) {
            Set<String> list = new HashSet<>();
            list.add("Vimal");
            list.add("Pankhaniya");
            list.add("London");
            list.add("Kingsbury");
            list.add("Tester");

            for (String name : list) {
                System.out.println(name);
            }
            Iterator itr = list.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
        }
        
        
}}
