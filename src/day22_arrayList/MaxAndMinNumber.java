package day22_arrayList;

import java.util.Arrays;

public class MaxAndMinNumber {
    public static void main(String[] args) {

       int[][] array = {{100,20,300}, {10,1000, 50}, {-200, 400, 0}};
       
       int max = array [0][0];
       int min = array [0][0];

        for (int[] each : array) {
            for (int eachElement : each) {
                if(eachElement > max){
                   max = eachElement;
                }

                if(eachElement < min){
                    min = eachElement;
                }
                
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);




    }
}
