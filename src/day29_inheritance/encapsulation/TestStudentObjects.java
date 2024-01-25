package day29_inheritance.encapsulation;

public class TestStudentObjects {
    public static void main(String[] args) {


        Student student1 = new Student("Jora", 23, 'F', 'A', "MIT");


        student1.setSchoolName("Harvard");
        student1.setGender('M');
        System.out.println(student1);





    }
}
