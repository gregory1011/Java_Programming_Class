package day12_CostumMethods;

public class CustomMethodsPractice {
    public static void main(String[] args) {

        // example with person is eligible or not to buy alcohol
       ageMethod(20);
        System.out.println("---------------");


        // example even and odd numbers
        numberMethod(7);
        System.out.println("---------------");


        //  example with grade of a student
        studentGrade(66);
        System.out.println("---------------");


        // example to compare 2 numbers
        maxNumber(100, 1020);
        System.out.println("---------------");


        // example with person initial
        initial("Ion", "Gorea");


    }

    // example with person is eligible or not to buy alcohol
    public static void ageMethod (int age){

        // example if a person is eligible to buy alcohol or not

        if (age >=21 && age <=150){
            System.out.println("The person is eligible");
        }else{
            System.out.println("The person is not eligible");
        }
    }

      // example even and odd numbers
       public static void  numberMethod  (int number){

           if (number == 0 ){
               System.out.println("The number is ZERO");
           }else if (number % 2 == 0 ){
               System.out.println("The number is even");
           }else {
               System.out.println("The number is odd");
           }

       }

       //  example with grade of a student

    public static void studentGrade (int score) {

        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");

        } else if (score >= 80 && score <= 89){
            System.out.println("Grade: B");
        }else if (score >= 70 && score <= 79){
            System.out.println("Grade: C");
        }else if (score >= 60 && score <=69){
            System.out.println("Grade: D");
        }else if (score >= 50 && score <= 59){
            System.out.println("Grade: F");
        }else{
            System.out.println("No grade");
        }
    }

    // create a method that can print the maximum number between two numbers,
    // if both are equal it prints "equal" , (num1, num2)

      public static void maxNumber(double num1, double num2){

        if( num1 > num2){
            System.out.println(num1+ " is the maximum number");
        }else if(num2 > num1){
            System.out.println(num2+ " is the maximum number");
        }else {
            System.out.println("Equal");
        }

      }


      // create a method that can display the initials of a person
        public static void initial (String firstName, String lastName){

        String initial = firstName.charAt(0)+ "."+lastName.charAt(0);

    System.out.println("initial = " + initial);
}

}


