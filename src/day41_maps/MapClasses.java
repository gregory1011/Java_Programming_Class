package day41_maps;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        // 4 classes below that can be created objects from
        //

        Map<String, Integer> hashMap = new HashMap<>();
        // HashMap implements map interface, and order is random
        // accepts one null key and multiple null values
        // the size id dinamic

        hashMap.put("Daniel", 95000); // the size is 1, there is one pair : name and salary
        hashMap.put("Emily", 100_000);
        hashMap.put("Bella", 85000);   // key dublication is not allowed
        hashMap.put("Bella", 77000);
        hashMap.put("Jora", 77000);    // value dublication is  allowed
        hashMap.put("Arron", 73000);
        hashMap.put("Chris", null);
        hashMap.put(null, 35000);
        System.out.println("hashMap = " + hashMap); // multiple pairs  : name and salary

        System.out.println("----------------------------------------------------------------------------------------------------------------------------");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        // LinkedHashMap extends to class of HashMap,  maintains same insertion order ,
        // accepts one null key and multiple null values

        linkedHashMap.put("Daniel", 95000); // the size is 1, there is one pair : name and salary
        linkedHashMap.put("Emily", 100_000);
        linkedHashMap.put("Bella", 85000);   // key dublication is not allowed
        linkedHashMap.put("Bella", 77000);
        linkedHashMap.put("Jora", 77000);    // value dublication is allowed
        linkedHashMap.put("Arron", 73000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put(null, 35000);

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("----------------------------------------------------------------------------------------------------------------------------");


        Map<String, Integer> treeMap = new TreeMap<>();
        // TreeMap implements the SortedMap interface, maintains the sorted order (ascending),
        // does not accept any null key, but allows null values

        treeMap.put("Daniel", 95000); // the size is 1, there is one pair : name and salary
        treeMap.put("Emily", 100_000);
        treeMap.put("Bella", 85000);
        treeMap.put("Bella", 77000);
        treeMap.put("Jora", 77000);
        treeMap.put("Arron", 73000);
        treeMap.put("Chris", null);   // value can not be null
       // treeMap.put(null, 35000); // key can not be null

        System.out.println("treeMap = " + treeMap);

        System.out.println("----------------------------------------------------------------------------------------------------------------------------");


        Map<String, Integer> hashTable = new Hashtable<>();
        // HashTable  implements the Map interface , maintains the random order,
        // does not accept any null key or null value
        // Hashtable is synchronized ( Thread-Safe )

        hashTable.put("Daniel", 95000); // the size is 1, there is one pair : name and salary
        hashTable.put("Emily", 100_000);
        hashTable.put("Bella", 85000);
        hashTable.put("Bella", 77000);
        hashTable.put("Jora", 77000);
        hashTable.put("Arron", 73000);
  //      hashTable.put("Chris", null);    value can not be null
   //     hashTable.put(null, 35000);     key can not be null
        System.out.println("hashTable = " + hashTable);








    }
}
