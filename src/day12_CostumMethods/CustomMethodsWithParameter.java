package day12_CostumMethods;

public class CustomMethodsWithParameter {
    public static void main(String[] args) {

        oddOrEven(100 );

        System.out.println("------------------");

        oddOrEven(10000 );


    }

    //  the method takes an argument number and verifies if the number is odd or even number
    public static void oddOrEven (int number){
        if(number % 2 == 0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }

    }

    // create a method that can check if a person is eligible to buy alcohol


}
