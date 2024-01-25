package day17_CustomClass;

public class frequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabcccd";

        String result = ""; //  a2b1c3d1
                            // a b c d
                            //  2 1 3 1


        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);  // first char = a
            int countFrequency = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch){
                    countFrequency++;
                }
            }

            if (result.contains(""+ch)){           // this condition is to avoid result a2a2b1c3c3c3d
                continue;   // continue means skip // avoid duplication  // our result needs to be a2b1c3d1
            }
            result += (ch +""+ countFrequency);

        }

        System.out.println(result);

    }
}
/*
Write a program that can find the frequency of the characters from a string

                Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */