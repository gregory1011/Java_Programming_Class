package day23_arrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Ronaldo");
        names.add("Ronaldo");
        names.add("Becali");
        names.add("Popescu");
        names.add("Moldovanu");
        names.add("Joana");
        names.add("Joana");


        for (String each : names) {
            if (names.indexOf(each) == names.lastIndexOf(each)){
                System.out.println(each);
                break;
            }
        }

        boolean hasMuhtar = names.contains("Muhtar");  // false
        boolean hasBecali = names.contains("Becali");   // true

        System.out.println("hasBecali = " + hasBecali);
        System.out.println("hasMuhtar = " + hasMuhtar);



    }
}
