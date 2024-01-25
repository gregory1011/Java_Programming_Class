package day20_forEach;

import java.util.Arrays;
import Utilities.ArraysUtility;
public class mergeTwoArrays {

    public static void main(String[] args) {

        int [] arr1 = { 1,2,3,4,5};
        int [] arr2 = { 6,7,8,9 };

        int [] arr3 = new int [ arr1.length + arr2.length ];  // to make sure arr3 has the capacity to contain arr1 and arr2

        int k = 0 ;  // index number of arr3 to add togheter : arr1 + arr2 index 

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3 [k] = arr1 [i] ;
        }
     //   System.out.println(Arrays.toString(arr3)); //

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3 [k] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));

        System.out.println("---------------------------------------");

        int[] a1 = {10,20,30,40,50,60};
        int[] a2 = {70,80,90};

        int[] a3 = ArraysUtility.merge(a1,a2);

        System.out.println( Arrays.toString(a3));


        System.out.println("---------------------------------------");

        double [] b1 = {2.5, 3.5, 4.5, 5.6};
        double [] b2 = {7.7, 8.8, 9.9};

        double [] b3 = ArraysUtility.merge( b1, b2 );

        System.out.println(Arrays.toString(b3));

        System.out.println("------------------------------------------");


        char [] ch1 = {'A', 'B', 'C', 'D', 'e'};
        char [] ch2 = {'v', 'g', 'j', 'k'};

        char [] ch3 = ArraysUtility.merge(ch1, ch2);
        System.out.println(Arrays.toString(ch3));


        String [] str1 = {"Java", "Programing", "Python", "Developer"};
        String [] str2 = {"C#", "GitHub", "Replit", "Scrum", "Working"};

        String [] str3 = ArraysUtility.merge(str1, str2);
        System.out.println(Arrays.toString(str3));


    }

}
