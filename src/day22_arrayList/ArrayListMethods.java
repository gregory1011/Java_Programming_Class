package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
       //     index:
        list.add(10); // 0
        list.add(20); // 1
        list.add(30); // 2
        list.add(10); // 3
       // list.add(5.5);  double not working because it's not Integer will not be supported
        System.out.println(list);

        list.add(1, 15);
        System.out.println(list);

        list.add(3, 25);
        System.out.println(list);

        System.out.println("-------------------------------------");

        ArrayList<String> studentsList = new ArrayList<>();

        studentsList.add("Ronaldo");
        studentsList.add("Messi");
        studentsList.add("Tores");
        studentsList.add("Mbapee");

        System.out.println(studentsList.size());
        System.out.println(studentsList);

        String firstIndex = studentsList.get(0);
        System.out.println(firstIndex);

        String lastIndex = studentsList.get( studentsList.size() -1 );

        System.out.println(lastIndex);




    }
}
