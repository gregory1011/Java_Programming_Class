package day16_NestedLoop;

import java.sql.SQLOutput;

public class frequencyOfChar {
    public static void main(String[] args) {

       String str = "aabbbccccc";
       char ch = 'c';

       int count = 0;

        for (int i = 0; i < str.length(); i++) {  // i: index number of str

            if ( str.charAt(i)  == ch){
                // if the character of the string is equal to the given character, then it means the given character has appeared in the string
                count++;
            }
        }

        System.out.println(count);

    }
}
