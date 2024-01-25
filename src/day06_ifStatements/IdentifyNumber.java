package day06_ifStatements;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number = 200;
        boolean isPositive= number >0;   // if the number is greater than zero, then  is positive
        boolean isNegative = number <0;   // if the numeber is less than zero, then is negative
      // boolean isZero = number == 0 ;   /// if he number is equal to zero, then  is zero
        boolean isZero= !isPositive && !isPositive;  // if the number is not positive and negative , then is equal to zero

        System.out.println(number+ " is positive number: " + isPositive);
        System.out.println(number+" is negative number: "+isNegative);
        System.out.println(number+ " is zero: "+isZero);

    }


}
/*
2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */