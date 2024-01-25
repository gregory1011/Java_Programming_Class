package day14_MetodOverloading;

public class StringReverse_InterviewQuestion {
    public static void main(String[] args) {


       String str = "Hello World";   // get the reverse result = avaJ
//            index: 0123

        String reverse = "";   // "avaJ"

        for(int i = str.length()-1; i >=0; i--){
            reverse += str.charAt(i);
        }

        System.out.println(reverse);

        System.out.println("------------------------------");

        String name ="Grigore Rosca Boss";
       String result =  reverse(name);
        System.out.println(result);


    }


    public static String reverse(String str){
        String reverse ="";

        for(int i = str.length()-1; i >=0; i--){
            reverse += str.charAt(i);
        }

        return reverse;
    }


}
