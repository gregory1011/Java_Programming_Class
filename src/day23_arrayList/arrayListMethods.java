package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListMethods {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};
        array[0] = 100;

        System.out.println(Arrays.toString(array));

        System.out.println("-------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("Apples");
        groceriesList.add("Oranges");
        groceriesList.add("Butter");
        groceriesList.add("Grapes");
        System.out.println(groceriesList);

        groceriesList.set(0, "Milk");
        groceriesList.set(1, "Paper");
        groceriesList.set(2, "Salt");
        System.out.println(groceriesList);

        groceriesList.add(2, "Sugar");
        System.out.println(groceriesList);

        groceriesList.remove(2);
        groceriesList.remove("Paper");
        System.out.println(groceriesList);

        System.out.println("-------------------------------------------");


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.remove(Integer.valueOf(20));
        System.out.println(numbers);

        System.out.println("-------------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");    // 0
        names.add("Vasyl");    // 1
        names.add("Ronaldo");  // 2
        names.add("Tyson");    // 3
        names.add("Ronaldo");  // 4
        names.add("Becali");   // 5

        System.out.println( names.indexOf("Vasyl"));
        System.out.println( names.lastIndexOf("Vasyl"));

        System.out.println( names.lastIndexOf("Ronaldo"));




    }
}
