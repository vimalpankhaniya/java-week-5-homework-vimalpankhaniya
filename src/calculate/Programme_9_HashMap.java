package calculate;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {
    public static void main(String [] args){
        // object is people
        HashMap<String, Integer> people = new HashMap<String, Integer>();


        // Add keys and values (Name, Age)
        people.put("Vimal", 32);
        people.put("Sachin", 30);
        people.put("Raju", 33);

        for (Map.Entry<String, Integer> pair: people.entrySet()) {
            System.out.format("key: %s, value: %d%n", pair.getKey(), pair.getValue());
        }
    }
    }

