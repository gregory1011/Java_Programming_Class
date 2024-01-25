package day07_ifStatments;

public class Grade {
    public static void main(String[] args) {
        char grade = 'E';

        String result="Student";  // "" in between the quotes can be stored any data

        if ( grade == 'A'){
            result = "Exelent";
        }
        if (grade == 'B'){
            result ="Great Job";
        }
        if (grade =='C'){
            result = "Good";
        }
        if (grade == 'D'){
            result = "Passed";
        }
        if (grade == 'E'){
            result = "Failed";
        }

        System.out.println(result);   /// result will be any: A,B,C,D,E
    }



}
/*
2. Create a class named Grade, a char variable named grade is given.
             write a program to print the following messages:
            'A': Excellent
            'B': Great job
            'C': Good
            'D': Passed
            'F': Failed

        Note: Do not use more than one print statement

 */