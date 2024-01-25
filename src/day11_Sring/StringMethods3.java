package day11_Sring;

public class StringMethods3 {
    public static void main(String[] args) {
        // empty method

       //  String word = "Java";  // false boolean
         String word = "";   // boolean is true
        boolean r1 = word.isEmpty();

        System.out.println(r1);

        System.out.println("--------------------------------");

        String str ="              ";
        boolean r2 = str.isEmpty();  // between "  " are characters empty spaces and boolean is false
        boolean r3 =str.isBlank();
        System.out.println("r2 = " +r2);   // false
        System.out.println("r3 = " + r3);   // true

        System.out.println("--------------------------------");

        // equals method - comparing one string to another

        String str1 = "Cydeo";
        String str2 = new String("Cydeo");

        System.out.println(str1 == str2);  // false they are two different objects
        System.out.println(str1.equals(str2));   // true  because they are same characters


        String str3 = new String("cydeo");
        System.out.println(str1.equals(str3));   /// false because is writen sensitive

        System.out.println("--------------------------------");

        String s1 = "JAVA";
        String s2 = "java";
        System.out.println(s1.equals(s2));   // false
        System.out.println(s1.equalsIgnoreCase(s2));  // true

        System.out.println("--------------------------------");

        // contains method

        String students = " Hase Naran Sumeve Naatliia";
        boolean hasAhmed = students.contains("Ahmed");

        System.out.println("hasAhmed = " + hasAhmed);   // false

        System.out.println("--------------------------------");

        String sentence = "My favorite programming language is JAVA";
         // boolean hasJAVA = sentence.contains("java");  False  because case sensityve

        boolean hasJAVA = sentence.toLowerCase().contains("java");   // true

        System.out.println("hasJAVA = " + hasJAVA);

        System.out.println("--------------------------------");

        // starts with - ends with

        String name = "Michael";

        boolean l = name.startsWith("Da");  // false

        System.out.println(l);

        String url = "www.cydeo.com";

        boolean isValid = url.startsWith("www.");   // true

        System.out.println("isValid = " + isValid);

        boolean t = url.endsWith(".com");   // true

        System.out.println(t);  // true

        System.out.println("--------------------------------");

        String email = "CudeoSchool@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");

        boolean isYahoo = email.endsWith("yahoo.com");

        boolean isHotMail = email.endsWith("hotmail.com");


        System.out.println("isHotMail = " + isHotMail);  // false
        System.out.println("isYahoo = " + isYahoo);   // false
        System.out.println("isGmail = " + isGmail);    // true
        







    }
}
