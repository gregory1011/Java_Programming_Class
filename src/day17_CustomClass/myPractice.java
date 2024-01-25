package day17_CustomClass;

public class myPractice {
    public static void main(String[] args) {

        String name = "grigore rosca";
        String result = "";


        for (int j = 0; j < name.length(); j++) {


            char ch = name.charAt(j);
            int countFrequency = 0;

            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == ch) {
                    countFrequency++;
                }
            }

            if(result.contains(""+ch)){
                continue;
            }
            result += ch +""+ countFrequency;

        }

        System.out.println(result);


    }
}
