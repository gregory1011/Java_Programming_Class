package day11_Sring;

import javax.sound.midi.Soundbank;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1 = "CYDEO SCHOOL";
        str1 = str1.toLowerCase();  // "  cydeo school

        System.out.println("-------------------------");


        String str2 = "java programming";

       String str3 = str2.toUpperCase();

        System.out.println(str3);

        System.out.println("-------------------------");

        String word = "Wooden Spoon";
        word = word.toUpperCase();
        word = word.toLowerCase();

        System.out.println(word);

        System.out.println("-------------------------");

        String str4 = "          Cydeo School";
        str4 = str4.trim();  // "Cydeo School"    this method removes white spaces

        System.out.println(str4);

        System.out.println("-------------------------");

        // example with index number

        String sentence1 = "Today is Sunday, and we have Java Class";

        int index1 = sentence1.indexOf('w');

        System.out.println(index1);


        String s1 = "I Love Java Programming";

        int firstA = s1.indexOf('a');

        System.out.println(firstA);

        int secondA = s1.indexOf("a ");
        System.out.println(secondA);


        String s2= "Java Python JavaScript Cydeo Python";
        int a1 = s2.indexOf('a');
        System.out.println(a1);

        int a2 = s2.indexOf("a Phyton");
        System.out.println(a2);

        int a3 = s2.indexOf("avaScript");
        System.out.println(a3);

        int a4 = s2.indexOf("aS");
        System.out.println(a4);

        System.out.println("-------------------------");

        // Example of lastIndex
        String w = "Java";
        System.out.println(w.indexOf('a'));  // 1

        System.out.println(w.lastIndexOf('a'));  // 3


        String w2 = "Java Python JavaScript Cydeo Python";

        System.out.println(w2.lastIndexOf('a'));  // 15
        System.out.println(w2.lastIndexOf('P'));   // 29




    }
}
