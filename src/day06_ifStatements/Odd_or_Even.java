package day06_ifStatements;

public class Odd_or_Even {
    public static void main(String[] args) {
       int number =46;
       boolean isEven = number % 2==0;  // equal with 0 // when we divide a number by 2 , if the reminder is Equal = 0 that means is Even
       // boolean isOdd = number % 2 != 0;  // != not equal with 0 // // when we divide a number by 2 , if the reminder dos Not  = 0 that means is Odd
        boolean isOdd = !isEven;  // ! is not /
         System.out.println(number+" is even number: "+ isEven);  //true

        System.out.println(number+" is odd number: "+isOdd );

    }
}
/*
1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)
 */