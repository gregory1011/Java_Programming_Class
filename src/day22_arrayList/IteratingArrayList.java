package day22_arrayList;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(2,222);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3,255);
    //  numbers.add(index:300, element: 200);  : this example will be out of bounds, because index 300 is not valid within the index number currently exist

        System.out.println(numbers);

        System.out.println("------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            int each = numbers.get(i);
            System.out.print(each + ", ");
        }
        System.out.println();
        System.out.println("------------------------------");

        for (Integer i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }

        System.out.println("------------------------------");

        for (Integer each : numbers) {
            System.out.println(each);
        }



    }
}
