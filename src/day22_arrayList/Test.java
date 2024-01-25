package day22_arrayList;

import Utilities.ArraysUtility;

public class Test {
    public static void main(String[] args) {
        
        int [] numbers = {10, 20, 30, 40, 50, 60, 70, 80};

       boolean has25 = ArraysUtility.contains(numbers, 25);

        System.out.println("has25 = " + has25);

        System.out.println("-----------------------------------");


        String [] students ={"Sumeve", "Hamza", "Marika"};
        
        boolean result =  ArraysUtility.contains(students, "George");
        System.out.println("result = " + result);


    }
}
