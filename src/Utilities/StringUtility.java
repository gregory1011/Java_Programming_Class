package Utilities;

public class StringUtility {

    public static String reverse(String str) {
        String reverse = "";     // to contain all the characters of the given string in the reverse order

        for (int i = str.length() - 1; i >= 0; i--) {  // i: index number of the strng startim from last index to index zero "0
            reverse += str.charAt(i);   // to het each character of the string starting from last index to index zero "0
        }

        return reverse;


    }

}
