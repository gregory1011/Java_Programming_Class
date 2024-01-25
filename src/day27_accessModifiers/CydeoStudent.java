package day27_accessModifiers;

public class CydeoStudent {
    public String name;
    public int age;
    public char gender;

    public static String schoolName = "Cydeo School";
    public static String secretCode;

    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    static {
      //  schoolName = "Cydeo School";
        secretCode = "Java Programming";
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
