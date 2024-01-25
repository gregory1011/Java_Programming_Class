package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Jora"); // one pair
        // size of the map is dinamic
        map.put("B03", "Nora");
        map.put("A04", "Abdulah");
        map.put("C43", "Rosa");
        map.put("A34", "Maria");
        map.put("A35", "Maria");
        map.put("A36", "Maria");
        map.put("A37", "Maria");

        System.out.println(map.size()); // counts nr of pairs
        System.out.println(map);
        System.out.println(map.get("A34"));
        // key cannot be changed
        // value can be changed
        map.put("A04", "Roma");

        System.out.println(map);

        map.replace("A36", "Lucy");
        System.out.println(map);
        map.remove("A34");
        System.out.println(map);

        System.out.println(map.containsKey("B03"));  // true or false

        System.out.println(map.containsValue("Nora")); // true or false

        System.out.println(map.isEmpty()); // true or false
        System.out.println(map.equals(map));   // true or false

        map.clear();  // zero









    }
}
