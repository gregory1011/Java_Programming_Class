package day40_collectionContinue;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {


        Collection<Integer> collection = new ArrayList<>();

        collection.add(100);
        collection.addAll(Arrays.asList(200, 300, 400, 500, 600, 700, 200, 300));

        System.out.println(collection);

        int num = ((ArrayList<Integer>) collection).get(3);

        System.out.println(num);
     //   System.out.println( ( (Stack) collection).pop );

        System.out.println("--------------------------------------------");

        Collection<Integer> collection2 = new HashSet<>();
        collection2.addAll(Arrays.asList(200, 300, 400, 500, 600, 700, 200, 300));

        System.out.println(collection2);

      //  System.out.println(  ( (ArrayList)collection2).get(4) );

        System.out.println( new ArrayList<>(collection2).get(4));

        List<Integer> l = new ArrayList<>(collection2);







    }
}
