package day23_arrayList;

import java.util.ArrayList;

public class removeDuplicates {
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

        System.out.println(names);


        ArrayList<String> nonDup= new ArrayList<>();

        for (String each : names) {

            if (nonDup.contains(each)) {
                continue;
            }
            nonDup.add(each);
        }

       // names = nonDup;    // System.out.println(names);

        System.out.println(nonDup);

        System.out.println("---------------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2 = list1;
        list1.add(10);
        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);  // true


        ArrayList<Integer> l1 = new ArrayList<>();

        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(11);
        l2.add(11);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1 == l2);   // false

        System.out.println(l1.equals(l2));  // true

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(10);
        n2.add(20);
        n2.add(30);

        System.out.println(n1.equals(n2));  // true


    }
}
