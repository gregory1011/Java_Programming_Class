package day14_MetodOverloading;

public class OverLoadingTheMainMethod {
    public static void main(String[] args) {


        System.out.println("A");  // A
        main(25) ;        // B
        main(2.65);     // C
        main(true);   // D

    }

    public static void main(int args) {

        System.out.println("B");

    }

    public static void main(double args){

        System.out.println("C");

    }

    public static void main(boolean args) {

        System.out.println("C");

    }
}
