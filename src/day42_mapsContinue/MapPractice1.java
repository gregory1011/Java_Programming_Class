package day42_mapsContinue;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Lucy", "F");
        employeeMap.put("Maria", "F");
        employeeMap.put("Jora", "M");
        employeeMap.put("John", "M");
        employeeMap.put("Chris", "M");
        employeeMap.put("Hannah", "F");
        employeeMap.put("Helena", "F");
        employeeMap.put("Mike", "M");
        employeeMap.put("Roma", "M");
        employeeMap.put("Eric", "M");
        employeeMap.put("Anna", "F");
        employeeMap.put("Gerard", "M");


        System.out.println(employeeMap);
        System.out.println("-------------------------------------------------------------------------------");
        // how many male and female employees in the map?

        int countMale = 0;
        int countFemale = 0;

        /*
        for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name);
            if ( gender.equals("M") ){
                countMale++;
            }else {
                countFemale++;
            }
        }
        System.out.println("countMale = " + countMale);
        System.out.println("countFemale = " + countFemale);
         */

        for (String eachValue : employeeMap.values()) {
            if ( eachValue.equals("F") ){
                countFemale++;
            }else {
                countMale++;
            }
        }

        System.out.println("countMale employees = " + countMale);
        System.out.println("countFemale employees = " + countFemale);

        System.out.println("-------------------------------------------------------------------------------");
        // display all names of female employees

        /*
        for (String name : employeeMap.keySet() ) {
            String gender = employeeMap.get(name);
            if ( gender.equals("F") ) {
                System.out.println(name);
            }
        }

         */

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if ( eachEntry.getValue().equals("F")){
                System.out.println(eachEntry.getKey());
            }
        }

        System.out.println("-------------------------------------------------------------------------------");

        // update all the "M" values with male: and "F" values with female

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if ( eachEntry.getValue().equals("M") ){
                eachEntry.setValue("Male");
            }else {
                eachEntry.setValue("Female");
            }
        }
        System.out.println(employeeMap);


    }
}
