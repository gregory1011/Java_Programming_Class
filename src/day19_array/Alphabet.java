package day19_array;


import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] ascending = new char[26];   // index : 0 to 25
        char[] descending = new char[26];  // index: 0 to 25

        for (int i = 0, j = 'A', k ='Z'; i < ascending.length; i++, j++, k--) {
            ascending[i] = (char) j;   // A to Z
            descending[i] = (char) k;  // Z to A
        }

        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));

        System.out.println("---------------------------------------------------");

        char [] characters = new char [65535];

        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) i;
        }
        System.out.println(Arrays.toString(characters));
    }
}
