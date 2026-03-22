package org.example;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/*
    put(K key, V value): Associates the specified value with the specified key in the map. If the key already exists, the old value is replaced.
    get(Object key): Returns the value to which the specified key is mapped, or null if no such mapping exists.
    remove(Object key): Removes the mapping for a key from the map if it is present.
    containsKey(Object key): Checks if the map contains a mapping for the specified key.
    keySet(): Returns a Set view of all the keys contained in the map.
    values(): Returns a Collection view of all the values contained in the map
 */
public class MapDS {
    public static void main(String[] args) {
        TreeMap<String, Integer> studentToAge = new TreeMap();

        studentToAge.put("Bob",20);
        studentToAge.put("Alex",21);
        studentToAge.put("John",22);
        studentToAge.put("Mohammad",30);
        studentToAge.put("Seyer",25);
        //studentToAge.put('A',true);


        studentToAge.remove("Alex");

        //int[] nums = {2,3,4};
        //System.out.println(nums[0]);

        System.out.println(studentToAge.get("John"));
        System.out.println(studentToAge.get("Alex"));
        System.out.println(studentToAge.get("Wahid"));

        if(studentToAge.containsValue(25))
        {
            System.out.println("Found");
        }
        else {
            System.out.println("Not found");
        }


        Set keys = studentToAge.keySet();

        for (Object key : keys)
        {
            System.out.println(key);
        }

        Collection values = studentToAge.values();
        for(Object value : values)
        {
            System.out.println(value);
        }


        Set<Map.Entry<String, Integer>> entries = studentToAge.entrySet();
        for (Map.Entry<String, Integer> entry : entries)
        {
            System.out.println("Key: "+ entry.getKey());
            System.out.println("Value: "+ entry.getValue());
            System.out.println();
        }


    }
}
