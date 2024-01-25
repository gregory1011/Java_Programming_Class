package day19_array;

import java.util.Arrays;

public class arraysPractice {
    public static void main(String[] args) {

        String [] myGroup = new  String[5];
        myGroup [0] = "James";
        myGroup [myGroup.length - 1] = "Abraham";   // last index number of any string
        myGroup [2] = "Sam";
        myGroup [1] = "Kaziol";
        myGroup [3] = "Sovetic";


        System.out.println(Arrays.toString(myGroup));

        myGroup [1] = "Karoli";

        System.out.println("---------------------------------------------");

        System.out.println(Arrays.toString(myGroup));

        for (int i = myGroup.length - 1; i >= 0 ; i--) {
            System.out.println(myGroup[i]);
        }

        System.out.println("---------------------------------------------");


       int [] numbers = new int[100];
        System.out.println( Arrays.toString(numbers));


        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers [i]);
        }

    }
}
