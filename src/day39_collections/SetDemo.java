package day39_collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();   // order is random
        set1.addAll(Arrays.asList(10,20,30,40,50));  // duplicates are not allowed
        set1.addAll(Arrays.asList(10,20,30,40,50));
        set1.addAll(Arrays.asList(10,20,30,40,50));

        System.out.println(set1);

        Set<Integer> set2 = new LinkedHashSet<>();

        Set<Integer> set3 = new TreeSet<>();

        System.out.println("-----------------------------------------");

        String[] words = {"Java", "Java", "Python", "Python", "C#"};
        LinkedHashSet<String > result = new LinkedHashSet<>();
        result.addAll(Arrays.asList(words));
        System.out.println(result);






    }
}
