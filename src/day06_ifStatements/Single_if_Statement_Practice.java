package day06_ifStatements;



public class Single_if_Statement_Practice {
    public static void main(String[] args) {

        int number = 155;
        boolean isEven = number % 2 == 0;
        if (isEven){
            System.out.println("Even Number ");   // false
        }
        if(!isEven){
            System.out.println("Odd number");    // true is executed
        }
        System.out.println("-------------------------");

        if (number %2 != 0){
            System.out.println("Even Number");   /// true is executed  // false will never be execute
        }



    }
}
