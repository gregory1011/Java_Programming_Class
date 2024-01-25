package day21_multiDimensionalArray;

import java.util.Arrays;

public class multiDimensionalArray {
    public static void main(String[] args) {

        String [] group1 = {"Gerard", "Messi"};
        String [] group2 = {"Pique", "Ronaldo"};
        String [] group3 = {"Lampard", "Totti"};
        String [] group4 = {"Robinho", "Zidane"};

       String [][] groups = {group1, group2, group3, group4};

        for ( String[] eachGroup : groups ) {
            System.out.println(Arrays.toString(eachGroup));
        }

        System.out.println("------------------------------------");

        for (String[] eachGroup : groups) {
            for (String result : eachGroup) {
                System.out.println(result);
            }
        }

        System.out.println("------------------------------------");


        for (int i = groups.length - 1; i >= 0; i--) {
            for (int j = groups[i].length - 1; j >= 0; j--) {
                System.out.println(groups[i][j]);
            }
        }


    }
}
