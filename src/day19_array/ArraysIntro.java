package day19_array;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        int[] scores = new int[5];   //  [5] = index numbers from 0 to 4

        scores [0] = 10;
        scores [1] = 14;
        scores [2] = 33;
        scores [3] = 44;
        scores [4] = 95;
    //  scores [5] = 100;  // index out of bound

/*
      //  System.out.println("-----------------------");

       // scores = new int[10];   // index 0 ~9

       // scores = new int[20];    /// index 0  ~ 19

*/
        System.out.println( Arrays.toString(scores) );

        System.out.println(scores[2]);
        System.out.println("----------------------");

        for (int i = 0; i < scores.length; i++) {  // i: index number of scores array
            System.out.println(scores[i]);
        }

        System.out.println("----------------------");

        System.out.println( scores [scores.length - 1] );  // index of last number of the length

    }
}
