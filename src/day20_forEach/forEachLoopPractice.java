package day20_forEach;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class forEachLoopPractice {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6,7,8,9,10,11};

        for (int each : numbers) {

            if (each % 2 != 0){   // odd numbers
                System.out.print(each+ ", ");
            }
        }

        System.out.println("----------------------------");

        int [] nums = {100, 0, 20, 30, 40, 4, 5, 7, 9,8, 1030, 10203 };

        int max = nums [0];
        for (int each : nums) {
            if(each >max){
                max = each;
            }
        }

        System.out.println("max number = " + max);

        int min = nums [0];

        for (int each : nums) {
            if (each < min){
                min = each;
            }
        }
        System.out.println("min number= " + min);

        System.out.println("----------------------------");

        int[] a1 = {1,2,3,4,5,6,7};
        int [] a2 = {10,20,30,40,50,60,70};

        int [] result = new int[a1.length + a2.length];

        int k = 0;

        for (int each : a1) {
            result[k++] = each;
        }
        for (int each : a2){
            result[k++] = each;
        }

        System.out.println(Arrays.toString(result));

        System.out.println("----------------------------");

        String [] names = {"Mohamed Ali", "Mike Tyson", "Bruce Li", "Van Dame"};

        System.out.println(Arrays.toString(names));

        int j = 0;

        for (String each : names){
            System.out.println(each.charAt(0)+ "."+ each.charAt(each.lastIndexOf(' ') + 1 ));
        }









    }
}
