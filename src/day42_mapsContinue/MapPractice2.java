package day42_mapsContinue;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "developer");
        person1.put("salary", 100_000);
        person1.put("married", true);
        person1.put("hired_date", LocalDate.now());

        System.out.println(person1);

        System.out.println(person1.get("name"));
        System.out.println(person1.get("salary"));
        System.out.println(person1.get("job_title"));
        System.out.println( person1.get("hired_date"));
        System.out.println("-----------------------------------------------------------------------");

        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 30);
        person2.put("job_title", "SDET");
        person2.put("salary", 87_000);
        person2.put("married", false);
        person2.put("hired_date", LocalDate.now());

        System.out.println(person2);









    }
}
