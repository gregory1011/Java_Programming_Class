package day42_mapsContinue;

import java.util.LinkedHashMap;
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
        map.put("A37", "Maria");
        System.out.println(map);

        Map<String , String> employee = new LinkedHashMap<>();
        employee.putAll(map);
        System.out.println(employee);

        System.out.println(map.equals(employee)); // true
        System.out.println(map == employee);  // false








    }
}
