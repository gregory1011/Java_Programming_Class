package day21_multiDimensionalArray;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class addElements {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};
        int element  = 88;

        int [] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        System.out.println(Arrays.toString(new_array));

        System.out.println("==================================");

        int [] numbers = {100, 90, 80, 70, 60};
        System.out.println(Arrays.toString(numbers));
        numbers =  ArraysUtility.addElement(numbers, 50);

        System.out.println(Arrays.toString(numbers));

    }
}
