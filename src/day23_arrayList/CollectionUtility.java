package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        int max = Collections.max(list);

        int min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("--------------------------------------------");

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs", "Milk", "Salt", "Sugar","Blueberry", "Apple"));
        System.out.println(items);

        Collections.sort(items);

        System.out.println(items);

        System.out.println("--------------------------------------------");

        Collections.reverse(items);
        System.out.println(items);

        System.out.println("--------------------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll( Arrays.asList("Bijou","Hasan", "Luka", "Tony" ) );

        System.out.println(students);

        Collections.swap(students,2,0);
        Collections.swap(students,students.size() - 1,1);


        System.out.println(students);





    }
}
