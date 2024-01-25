package day15_WhileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {


        String str = "aabbbcccc";
        String result = "";

        for (int i = 0; i < str.length(); i++) {  // i: index numbers of str
          //  System.out.println( str.charAt(i));

            char each = str.charAt(i);   // each character of the String

            if( ! result.contains(""+each)){   // if the string result does not contain the string str yet
                result += each;    // then we will add thr character to string result

            }
            // logic. if the character is not contained yet in th new string, then we will add it to the new string
        }

        System.out.println(result);
    }
}
/*
3. Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc
 */