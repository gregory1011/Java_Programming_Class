package day41_maps;

import com.sun.javadoc.SeeTag;

import java.util.*;

public class ArrayPractice {

    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7,8,9,10,11,12));

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(70,80,90,100,110,120));

        List<Integer>[] arrayLists = new List[3];
        arrayLists[0] = list1;
        arrayLists[1] = list2;
        arrayLists[2] = list3;

        System.out.println(Arrays.toString(arrayLists));

        arrayLists[0].set(4,50);

        System.out.println(Arrays.toString(arrayLists));

         Set<Integer>[] arraySets = new Set[5];
         // not allowed to store list , only can store set objects ..
        System.out.println( Arrays.toString(arraySets));

        arraySets[0] = new LinkedHashSet<>();
        arraySets[1] = new LinkedHashSet<>();
        arraySets[2] = new LinkedHashSet<>();
        arraySets[3] = new LinkedHashSet<>();
        arraySets[4] = new LinkedHashSet<>();


        System.out.println( Arrays.toString(arraySets));

        arraySets[2].addAll(Arrays.asList(1,2,3,4));

        System.out.println(Arrays.toString(arraySets));




    }
}
