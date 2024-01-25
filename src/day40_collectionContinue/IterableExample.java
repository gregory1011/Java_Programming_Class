package day40_collectionContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableExample {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list .addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,1,2,3,4,5,56));

        /*
        for (Integer each : list) {
            if ( each < 5 ){
                list.remove(each);
            }
        }
        System.out.println(list);

         */

        for (int i = 0; i < list.size(); i++) {
            if ( list.get(i) < 5 ) {
                list.remove(i);
            }
        }
        System.out.println(list);

        System.out.println("--------------------------------------------------");

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,1,2,3,4,5,56));

        Iterator<Integer> it = list2.iterator();
        while ( it.hasNext()){
            Integer each = it.next();
            if ( each < 5) {
                it.remove();
            }
        }

        System.out.println(list2);

        System.out.println("--------------------------------------------------");


        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,1,2,3,4,5,56));


        for ( Iterator<Integer> i = list3.iterator();i.hasNext() ; ){
          Integer each = i.next();
          if (each < 5){
              i.remove();
          }
        }
        System.out.println(list3);

        System.out.println("--------------------------------------------------");


        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,1,2,3,4,5,56));

        list4.removeIf( each -> each < 5 );
        System.out.println(list4);


    }
}
