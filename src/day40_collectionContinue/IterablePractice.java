package day40_collectionContinue;

import java.util.*;

public class IterablePractice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,22));
        Iterator<Integer> iterator = list.iterator();

        System.out.println(iterator.hasNext()); // false if no elements exist. and True if elements exist
        System.out.println(iterator.next());  // first element = 10.

        System.out.println("-------------------------------------------------------------------");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed",
                "Ahmed", "ahmed", "Yuliia", "Chris"));

        /*
        Iterator<String> it = names.iterator();
        while ( it.hasNext() ) {
            String each = it.next();
            if ( each.equalsIgnoreCase("ahmed")){
             it.remove();
            }
        }
        System.out.println(names);
         */

        names.removeIf( p -> p.equalsIgnoreCase("ahmed"));
        System.out.println(names);

        System.out.println("------------------------------------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));

        // find the n largest number

        int n = 5;


        for (int i = 0; i < n -1 ; i++) {
            numbers.removeIf( p -> Collections.max(numbers) == p);
        }

        int max = Collections.max(numbers);
        System.out.println(max); // 5

        System.out.println("------------------------------------------------------");







    }
}
