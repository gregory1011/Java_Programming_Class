package day16_NestedLoop;

public class LetterBabauyaga {
    public static void main(String[] args) {

        String letter = "babayaga";
        String result = "";

        for (int j = 0; j < letter.length() ; j++) {

            char ch = letter.toLowerCase().charAt(j);   // 'j' stands for each character of the string we want to check
                                                        // how many times repeats
            int count = 0;
            for (int i = 0; i < letter.length(); i++) {

                if (letter.charAt(i) == ch){
                    count++;
                }

            }
            if (count == 2 && !result.contains(""+ch)) {
                result += ch;
            }
        }
        System.out.println(result);
    }
}
