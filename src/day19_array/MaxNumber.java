package day19_array;

public class MaxNumber {
    public static void main(String[] args) {

        int [] numbers = {100, 20, 30, 500, 40, -10, 30};
        int max = numbers[0];   // assume that first element is the maxim number

        for (int i = 0; i < numbers.length; i++) {   // i: 1, 2, 3, 4, ...7

            if (numbers [i] > max ) {  // compare the element of the array with current maxim number
                max= numbers[i];    // replace the current maxim number
            }

        }
        System.out.println("max = " +max);


    }

}
