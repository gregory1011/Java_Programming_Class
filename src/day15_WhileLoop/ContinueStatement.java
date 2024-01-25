package day15_WhileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i <=5; i++) {

            if ( i == 4) {   // excluding number 4, only
                continue;
            }

            System.out.println(i);
        }

        System.out.println("-------------------");

        for (int i = 10; i <= 20; i++) {

            if(i % 2 == 0){   // if i = even number
                continue;      // skips the current iteration
            }

            System.out.println(i);
        }

        System.out.println("-------------------");

        for (char i = 'A'; i <= 'G'; i++) {

            if (i == 'B' || i == 'E'){
                continue;
            }

            System.out.println(i);
        }
        System.out.println("-------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println("hello world");

        }
    }
}
