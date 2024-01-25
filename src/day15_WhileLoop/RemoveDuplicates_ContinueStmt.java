package day15_WhileLoop;

public class RemoveDuplicates_ContinueStmt {
    public static void main(String[] args) {

        String str = "xxyzxyzxyzzf";
        String  result ="";

        for (int i = 0; i < str.length(); i++) {

            if (result.contains( "" + str.charAt(i))  ){ // if the character is already contains in new string
                continue;   // then skip it
            }


            result += str.charAt(i);

        }

        System.out.println(result);

        System.out.println("---------------------------------");

        // find the sum of all the even numbers between 50 to 100

        for (int i = 50; i < 101 ; i++) {

            if ( i % 2 == 0 ) {
                System.out.print(i + " ");

            }

        }
        System.out.println();


        System.out.println("-------------");


        for (int i = 50; i < 101; i +=2) {
            System.out.print(i+" ");
        }
        System.out.println();


        System.out.println("-------------");

        for (int i = 50; i < 101 ; i++) {
            if (i % 2 != 0) {  // if the i's value is odd number
              continue; // skip it
            }
            System.out.print(i +" ");
        }
        System.out.println();







    }
}
/*
3. Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc
 */