package day23_arrayList;

import day19_array.ArraysLiteral;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    // methods _ adAll . removeAll, revokeAll

    public static void main(String[] args) {

             ArrayList<Integer> numbers = new ArrayList<>();
                numbers.add(10);
                numbers.add(20);
                numbers.add(30);
                numbers.add(40);


             ArrayList<Integer> list1 = new ArrayList<>();
             list1.add(1);
             list1.add(2);
             list1.add(3);

             list1.addAll(1, numbers);

             System.out.println(list1);


        System.out.println("-------------------------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll ( Arrays.asList(12, 13, 14, 15, 16) );

        System.out.println(scores);

        ArrayList<String> students = new ArrayList<>();
        students.addAll( Arrays.asList("Bijou","Hasan", "Luka", "Tony" ) );

        System.out.println(students);

        students.addAll(1,Arrays.asList("Pasa"));
        System.out.println(students);

        System.out.println("-------------------------------------------------");

        Integer [] num = {1,2,3,4,5,6,7,8,9};

        ArrayList <Integer> l1 = new ArrayList<>(Arrays.asList(num));

      //  l1.addAll(Arrays.asList(num));

        System.out.println(l1);

        System.out.println("-------------------------------------------------");

        ArrayList<String> employee = new ArrayList<>();
        employee.addAll(Arrays.asList("Jena", "Maria", "Gigi", "Daniela"));

        System.out.println(employee);


        boolean hasJena = employee.contains("Jena");
        boolean hasGigiMaria = employee.containsAll( Arrays.asList("Gigi", "Maria") );


        System.out.println("hasJena = " + hasJena); // true
        System.out.println("hasGigiMaria = " + hasGigiMaria); // true

        System.out.println("-------------------------------------------------");


        // removeAll

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll( Arrays.asList(10,10,20,20,40,40,50, 60, 70, 80));
        list.removeAll(Arrays.asList(10,20));

        System.out.println(list);

        System.out.println("-------------------------------------------------");

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena", "Muhtar", "Ali", "Tyson", "Rooney", "Rooney", "Ronaldo"));
        System.out.println(developers);
        developers.retainAll(Arrays.asList("Alena", "Ronaldo", "Jora"));

        System.out.println(developers);

        System.out.println("-------------------------------------------------");


        ArrayList<String> groceries = new ArrayList<>();

        groceries.addAll(Arrays.asList("Eggs", "Milk", "Oranges", "Grapes", "Tomato", "Rice", "Melon"));
        System.out.println(groceries);

        groceries.retainAll(Arrays.asList("Milk", "Rice", "Oranges"));
        System.out.println(groceries);


    }
}
