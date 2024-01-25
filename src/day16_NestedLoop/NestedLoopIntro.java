package day16_NestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wood Spoon");
        }

        System.out.println("_____________________________");
        // I want this loop to be repeaded 5 times

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.println("Wooden Spoon");
            }

        }


    }
}
