package day20_forEach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {

        int [] score = {10, 20, 30, 40};

        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score);
        System.out.println(result);

        System.out.println("------------------------------------------");

        int [] a1 ={1,2,3,4,5,};
        int [] a2 = {1,2,3,4,5};

        boolean r1 = Arrays.equals(a1, a2);
        System.out.println(r1);   //true

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'A', 'C', 'B'};
        boolean r2 = Arrays.equals(ch1, ch2);
        System.out.println(r2);   // false

        String [] s1 = {"a", "b", "c"};
        String [] s2 = {"a", "c", "b"};

        boolean str1 = Arrays.equals(s1, s2);
        System.out.println(str1);

        double[] n1 = {0,1,2,3};
        double[] n2 = {1,2,3,4};
        boolean n3 = Arrays.equals(n1, n2);
        System.out.println(n3);   // false

        System.out.println("------------------------------------------");


        int [] nums = {2,5,6,8,10,0,0,   -10 ,99};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString( nums));

        System.out.println("Minim number: "+ nums[0]);
        System.out.println("Maxim number: "+ nums[nums.length - 1]);


        System.out.println("------------------------------------------");


        char[] b1 = {'A', 'B', 'C'};
        char[] b2 = {'B', 'C', 'A'};

        Arrays.sort(b1);
        Arrays.sort(b2);

        boolean b3= Arrays.equals(b1, b2);
        System.out.println(b3);

        System.out.println("------------------------------------------");


        String [] students = {"Muhtar", "Ali", "Olea", "Jenea"};
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        System.out.println("------------------------------------------");

        int[] array1 = {10, 20, 30, 40, 50, 60, 70};
        int [] array2 = Arrays.copyOf(array1, 10);

        System.out.println(Arrays.toString(array2));

        System.out.println("------------------------------------------");


        // copyOf() -method

        int [] n01 = {1,2,3,4,5,};
        int [] n02 = {6,7,8,9,10,11,12,13};
        int [] n03 = Arrays.copyOf(n01, n01.length+n02.length);
        System.out.println(Arrays.toString(n03));


        for (int i = 0, j = n01.length; i < n02.length; i++, j++) {
           n03[j] = n02[i];
        }
        
        System.out.println(Arrays.toString(n03));

     // copyOfRange()  - method

        char [] ch = {'A', 'B','C','D', 'F', 'G', 'F'};
        // index:      0    1   2   3    4    5    6
        char [] result1 = Arrays.copyOf(ch, 15);
        System.out.println(Arrays.toString(result1));

       char[] result2 = Arrays.copyOfRange(ch, 2, 4);

        System.out.println(Arrays.toString(result2));

        char[] result3 = Arrays.copyOfRange(ch, 2, ch.length);
        System.out.println(Arrays.toString(result3));




    }
}
