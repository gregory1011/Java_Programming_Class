package day20_forEach;

import java.sql.Array;
import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cydeo School";
        char [] ch = str.replace(" ", "").toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("-----------------------------");

        String str2 = "Today is a great day to learn Java";

        String [] words = str2.split("");
        System.out.println(Arrays.toString(words));

        String [] word = str2.split("great");
        System.out.println(Arrays.toString(word));

        System.out.println("-------------------");

        String sentence = "I love java";
        String [] arr = sentence.split(" ");

        String [] reverse = new String[ arr.length ] ;

        int k  = 0 ;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[k++] = arr[i] ;

        }
        System.out.println(Arrays.toString(reverse));

        String reverseSentence = "";

        for (int i = 0; i < arr.length; i++) {
            reverseSentence += arr[i] + " ";
        }
        System.out.println(reverseSentence);








    }

}
