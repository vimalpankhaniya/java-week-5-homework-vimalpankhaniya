package calculate;
/**
 * Write a Java program to reverse an array of integer values.
 */

import java.util.Arrays;

public class Programme_3_ReverseArray {
    public static void main(String [] args){
        int [] my_array1 = {
                1225,1325,1425,1526,1750,1854,1954,2012,2045,4520};
        System.out.println("Original array :"+ Arrays.toString(my_array1));
        for (int i = 0; i< my_array1.length / 2; i++){

            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length-i-1];my_array1[my_array1.length -i-1]=temp;
        }
        System.out.println("Reverse array : "+ Arrays.toString(my_array1));
    }
}
