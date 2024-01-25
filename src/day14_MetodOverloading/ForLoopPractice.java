package day14_MetodOverloading;

public class ForLoopPractice {
    public static void main(String[] args) {


        for ( int i = 10; i >=5; i--){ // i: 10, 9, 8, 7, 6, 5, 4
            System.out.println("Hello " + i);   // 1, 2, 3, 4, 5, 6
        }

        System.out.println("---------------------------------------");


        for ( int i = 10; i >=5; i--){ // i: 10, 9, 8, 7, 6, 5, 4
            System.out.println("Hello " + i);   // 1, 2, 3, 4, 5, 6
        }

        System.out.println("---------------------------------------");



        // sum of the numbers from 1 to 100

        int sum = 0;

        for ( int i = 1; i <=100; i++){
            sum += i;
        }
        System.out.println(sum);   // 5050

        System.out.println("---------------------------------------");


        // print all the alphabet letters from A to Z

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------");


        // Print all the alphabet letters in backwards

        for (char i = 'Z'; i >= 'A'; i--){
            System.out.print(i + " ");
        }


    }


}
