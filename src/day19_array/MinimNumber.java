package day19_array;

public class MinimNumber {
    public static void main(String[] args) {

        int[] numbers = {20, 10, 50, -20, 3, 5, 1, -9};
        int minim = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minim){
                minim = numbers[i];
            }
        }


        System.out.println("minim number is: "+minim);


    }
}
