package day21_multiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class multiDimensionalArrayIntro {
    public static void main(String[] args) {

        int[] arr1 = {10,20,30};
        int[] arr2 = {40, 50, 60, 70};
        int[] arr3 = {80, 90};
        int[] arr4 = {1000, 2000};

        System.out.println("--------------------------");

        int[][] arr2D = { {10,20,30}, {40,50,60,70}, {80,90}, arr4 };

      //  int[][] arr4 = new int [3] [];

        System.out.println(arr2D.length);

        System.out.println("--------------------------");


        for (int i = 0; i < arr2D.length; i++) {
            int [] each1D = arr2D[i];
            System.out.println(Arrays.toString(each1D) );

            for (int j=0 ; j < each1D.length; j++) {  // index number of elements in each 1d array and of arr2D
                int eachElement = each1D[j];

                System.out.println(eachElement);
            }
        }


        System.out.println("--------------------------");

        for ( int [] each1DArray : arr2D) {
            System.out.println(Arrays.toString(each1DArray));

            for (int j : each1DArray) {
                System.out.println(j);
            }
        }

        System.out.println("--------------------------");


        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.println(arr2D[i][j]);
            }
        }

        System.out.println("--------------------------");


        int a = 100, b = 200, c = 300;
        int[][] score = {{a}, {b}, {c}};

        for (int[] each : score) {

            System.out.println(Arrays.toString(each));
            for (int i : each) {
                System.out.println(i);
            }
        }
        System.out.println("--------------------------");

        // reverse
        for (int i = score.length - 1; i >= 0; i--) {
            int [] result = score[i];
            System.out.println(Arrays.toString(result));

            for (int j = result.length - 1; j >= 0; j--) {
                int reverse = result[j];
                System.out.println(reverse);
            }
        }

    }
}
