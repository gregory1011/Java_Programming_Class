package day41_maps;

import day26_static.Employee;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        List<List<Integer>> lists = new ArrayList<>();
        // nested list or list of list
        List<int[]> list1 = new ArrayList<>();
        // list of array
       // list1.add();

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6));
        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(7,8,9,10,11,12));

       // lists.addAll(Arrays.asList(list3,list4));
        // list of list

        lists.add(list3);
        lists.add(list4);

        System.out.println(lists);

        // get element "10"
        System.out.println(lists.get(1).get(3));

        for ( List<Integer> eachList : lists) {
            for (Integer eachElement : eachList) {
                System.out.println(eachElement);
            }
        }

        System.out.println("-------------------------------------------------------------------------");

        List<Set<Integer>> listSet = new ArrayList<>();
        // list of sets
        listSet. add(new LinkedHashSet<>());  // 0
        listSet. add(new LinkedHashSet<>());  // 1
        listSet. add(new LinkedHashSet<>());  // 2
        listSet. add(new LinkedHashSet<>());  // 3
        // size of list of set s 4, but we don't have elements
        System.out.println(listSet);

        // add {10, 5, 20}
        listSet.get(0).addAll(Arrays.asList(10,5,20));
        listSet.get(1).addAll(Arrays.asList(30,25,220));
        listSet.get(2).addAll(Arrays.asList(110,35,420));
        listSet.get(3).addAll(Arrays.asList(130,56,720));
        System.out.println(listSet);


        System.out.println("-------------------------------------------------------------------------");

        int [] arr1 = {1,2,3,4,5,6};
        int [] arr2 = {7,8,9,10,11};

        List<int[]> listArrays = new ArrayList<>();
        // i can store 1 dimensional array
        listArrays.add(arr1);
        listArrays.add(arr2);

        System.out.println(listArrays);
        // hash code // didnt compile
        listArrays.get(0)[2] = 35;  // the element at index 2 is updated to 35
        System.out.println( Arrays.toString( listArrays.get(0)));

        System.out.println("-------------------------------------------------------------------------");

       // List<List<Employee>> teams = new ArrayList<>();










    }
}
