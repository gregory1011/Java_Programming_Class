package day16_NestedLoop;

public class frequencyOfWord {
    public static void main(String[] args) {


        String sentence = " java JavA JAva JaVa";
        String word = "Java";

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int count = 0;

        while (sentence.contains(word)){
            count++;
           sentence = sentence.replaceFirst(word, "");

        }

        System.out.println(count);  // 4

    }
}
