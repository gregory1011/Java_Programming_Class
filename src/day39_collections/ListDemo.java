package day39_collections;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        arrayList.get(0);

        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("-----------------------------");

        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);

        vector.get(0);

        System.out.println("-----------------------------");

        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);

        stack.get(0);





    }
}
