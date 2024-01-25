package day21_multiDimensionalArray;

import java.util.Arrays;

public class multiDimensionalArray_03 {
    public static void main(String[] args) {

        int [][] arr2D1 = { {1,2}, {3,4,5}};
        int [][] arr2D2 = { {6,7,8,9}, {10,11}, {12,13,14}};
        int [][] arr2D3 = { {15,16,17,18} };

        int [][][] arr3D = { {{1,2} , {3,4,5}} , {{6,7,8,9}, {10,11}, {12,13,14}} , {{15,16,17,18}} };
           //     index:            0                           1                          2

        // [ index of 2d array ]  [ index of 1d array ] [ index of element ]
        System.out.println(Arrays.deepToString( arr3D ));
        System.out.println( Arrays.toString(arr3D [0][1] ));
        System.out.println(Arrays.toString(arr3D [1][1]));

        System.out.println(arr3D[1][2][1]);
        System.out.println(arr3D[2][0][1]);

        System.out.println("------------------------------");

        for (int i = 0; i < arr3D.length; i++) {
            int [][] each2dArray = arr3D[i];
            System.out.println(Arrays.deepToString(each2dArray));

            for (int j = 0; j < each2dArray.length; j++) {
                int[] each1DArray = each2dArray[j];
                System.out.println(Arrays.toString(each1DArray));

                for (int k = 0; k < each1DArray.length; k++) {
                    int result = each1DArray[k];
                    System.out.println(result);
                }
            }
        }


    }
}
