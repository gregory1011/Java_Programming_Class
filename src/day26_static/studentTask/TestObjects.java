package day26_static.studentTask;

public class TestObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Jora", 21, 'M', "A13");
        Student student2 = new Student("Victoria", 22, 'F', "A23");
        Student student3 = new Student("Vova", 24, 'M', "A24");
        Student student4 = new Student("George", 25, 'M', "A25");
        Student student5 = new Student("Maria", 12, 'F', "A43");

        Student[] students = {student2, student3, student4, student5};


        StudentsGroup group1 = new StudentsGroup("Java Turtles", 1);
        group1.addStudent(student1);

        group1.addStudent(students);
        group1.addStudent("Coco", 34, 'F', "D22");

        System.out.println(group1);

        group1.removeStudent("A24");

        System.out.println(group1);    // only 5 student are left in group

        for (Student each : group1.students) {
            System.out.println(each.name + " " + each.id);
        }

        System.out.println("-------------------------------------");


        StudentsGroup group2 = new StudentsGroup("Java Turtles", 1);

        StudentsGroup group3 = new StudentsGroup("Java Turtles", 1);

        StudentsGroup group4 = new StudentsGroup("Java Turtles", 1);

        StudentsGroup[] groups = {group1, group2, group3, group4};


    }
}
