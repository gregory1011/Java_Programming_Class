package day20_forEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        int [] reverse  = new int [array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse [j++] = array[i];
        }
        System.out.println(Arrays.toString(reverse));

        System.out.println("--------------------------------");


        int [] nums = {23, 24, 25, 26, 27};
        int [] nums2 = ArraysUtility.reverse(nums);
        System.out.println(Arrays.toString(nums2));

        System.out.println("--------------------------------");


        double  [] a1 = {1.1, 2.2, 3.3, 4.4, 4.5};
        a1 = ArraysUtility.reverse(a1);
        System.out.println(Arrays.toString(a1));

        System.out.println("--------------------------------");

        char [] b1 = {'a', 'b', 'c', 'd', 'h'};
        b1 = ArraysUtility.reverse(b1);
        System.out.println(Arrays.toString(b1));



    }


}
