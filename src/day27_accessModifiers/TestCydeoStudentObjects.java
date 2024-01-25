package day27_accessModifiers;
public class TestCydeoStudentObjects {

    public static void main(String[] args) {


        System.out.println(CydeoStudent.schoolName);

        CydeoStudent student1 = new CydeoStudent("Eugen", 34, 'M');
        CydeoStudent student2 = new CydeoStudent("Jora", 32, 'M');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("-------------------");

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

        System.out.println(student1.secretCode);
        System.out.println(student2.secretCode);

    }
}
