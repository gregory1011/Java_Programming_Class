package day20_forEach;

public class forEachLoop {
    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+", ");
        }
        System.out.println();
        System.out.println("-------------------------");

        for( int each : numbers ){
            System.out.print(each+", ");
            continue;
        }


    }
}
