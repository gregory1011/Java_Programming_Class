package day13_CustomMethods;

public class ReturnMethodIntro {
    public static void main(String[] args) {

    // int total = sum (20, 40); this is void method, does nod return any data

        int total = addition(10, 20);
        System.out.println(total);

        System.out.println("------------------");


        int t = square(10);
        System.out.println(square(10));

        System.out.println("------------------");


        int r = cube(5);
        System.out.println(cube(5));

        System.out.println("------------------");




    }

    public static void sum (int n1, int n2){

        int result = n1 + n2;
        System.out.println(result);

        
    }


    public static int addition (int n1, int n2 ){

       int result = n1+n2;
       return result;


    }



    public static int square(int num) {
        int square = num * num;
        return square;

    }


    public static int cube ( int num ){
        int cube = square(num) * num;
        return cube;

    }


}
