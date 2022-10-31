package calculate;
/** Write a Java program to create a new array list, add some colours (string) and
 printout the collection using for each loop.
 *
 */

import java.util.ArrayList;

public class Programme_4_ArrayList {
    public static void main(String[] args) {

        // Array List
        ArrayList<String> colourlist = new ArrayList<>();
        colourlist.add("Pink");
        colourlist.add("Red");
        colourlist.add("Blue");
        colourlist.add("Black");
        colourlist.add("Purple");
        colourlist.add("White");
        colourlist.add("Light Blue");

        for (String colour : colourlist)
        System.out.println(colourlist);
    }
}
