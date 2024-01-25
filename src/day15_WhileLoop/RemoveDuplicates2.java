package day15_WhileLoop;

public class RemoveDuplicates2 {
    public static void main(String[] args) {


        String example = "aaabbddrrttt";
        String result = "";

        for (int i = 0; i < example.length(); i++) {
            char each = example.charAt(i);

            if( ! result.contains(""+each)){
                result += each;
            }

        }
        System.out.println(result);
    }
}
