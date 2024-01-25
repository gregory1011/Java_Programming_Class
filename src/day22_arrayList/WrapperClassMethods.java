package day22_arrayList;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "20";
        System.out.println(str +1);

      // Integer num1 =  Integer.parseInt(str);   // unboxing
        int num = Integer.parseInt(str);
        System.out.println(num + 1);

        Integer n = Integer.valueOf(str);
        System.out.println(n);

        System.out.println("--------------------");

        String s = "20.5";

        double num3 = Double.parseDouble(s);
        Double num4 = Double.valueOf(s);

        System.out.println(num3);
        System.out.println(num4);

        System.out.println("--------------------");

        String x = "true";

        boolean r1 = Boolean.parseBoolean(x);
        Boolean r2 = Boolean.valueOf(x);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("--------------------");

        char ch = '1';
        boolean q1 = Character.isDigit(ch);
        System.out.println("isDigit = "+q1);

        System.out.println("--------------------");

        char ch2 = 'A';
        boolean q2 = Character.isLetter(ch2);
        boolean isLowerCase = Character.isLowerCase(ch2);
        boolean isUpperCase = Character.isUpperCase(ch2);

        System.out.println("isDigit = "+q2);
        System.out.println("isLowerCase = " + isLowerCase);
        System.out.println("isUpperCase = " + isUpperCase);

        System.out.println("----------------------------------");

        char ch3 = '#';

        boolean isSpacialChar = ! Character.isLetterOrDigit(ch3);

        System.out.println("isSpacialChar = " + isSpacialChar);

        System.out.println("----------------------------------");

        String words = "a1b2c3d4e5";

        int sum = 0;

        for (char each : words.toCharArray()){
            if (Character.isDigit(each)){
                sum += Integer.parseInt("" + each);
            }
        }

        System.out.println("sum = " + sum);


    }

}
