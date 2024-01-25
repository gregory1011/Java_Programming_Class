package day40_collectionContinue;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>();
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(null, null, null));  // does not


        System.out.println(queue1);


        Queue<Integer> queue2 = new ArrayDeque<>();

        Queue<Integer> queue3 = new LinkedList<>();

        System.out.println("---------------------------------");

        Queue<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(10, 20, 30, 40, 500, 600));
        list.addAll(Arrays.asList(11, 22, 33, 44, 500, 600));
        list.poll(); // removes first element

        System.out.println(list);







    }
}
