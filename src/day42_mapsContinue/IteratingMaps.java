package day42_mapsContinue;

import java.util.HashMap;
import java.util.Map;

public class IteratingMaps {

    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap<>();

        map.put("Daniel", 95000); // the size is 1, there is one pair : name and salary
        map.put("Emily", 100_000);
        map.put("Bella", 85000);
        map.put("Jora", 77000);
        map.put("Arron", 73000);

        System.out.println(map);

        // iterating the map by the keys - eachKey
        for  ( String eachKey : map.keySet()  ) {
            System.out.println(eachKey);
           //  map.replace(eachKey, map.get(eachKey) * 2); // double the value * 2

        }
        System.out.println(map);

        System.out.println("-----------------------------------------------------------------------------");


        // iterating the map by values
        for ( Integer eachValue : map.values() ){
            System.out.println(eachValue);
        }
        System.out.println(map);

        System.out.println("-----------------------------------------------------------------------------");

        // iterating by entry
        // map.entrySet();
        
        for ( Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            System.out.println(eachEntry);

        }

        System.out.println("-----------------------------------------------------------------------------");

        for ( Map.Entry<String, Integer> eachEntry : map.entrySet() ) {
            String eachKey = eachEntry.getKey();
            Integer eachValue = eachEntry.getValue();
            eachEntry.setValue(eachValue + 10000);
            System.out.println(eachKey + " : "+ eachValue);
        }

        System.out.println(map);




    }
}
