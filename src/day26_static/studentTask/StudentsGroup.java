package day26_static.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {

    public String groupName;
    public int groupId;
    public ArrayList<Student> students = new ArrayList<>();  //   = new ArrayList<>()  this lane is same as line 14th

    public StudentsGroup(String groupName, int groupId) {
        // this constructor creates StudentsGroup object by setting the groupName and groupId
        this.groupName = groupName;
        this.groupId = groupId;
        students = new ArrayList<>();
    }

    public void addStudent(Student student){   // takes one student object and adds to arrayList of students
        students.add(student);
    }

    public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students));
    }

    public void addStudent ( String name, int age, char gender, String id){ // takes name, age, gender, id of student info
       // Student students = new Student(name, age, gender, id);
        students.add(new Student(name, age, gender, id));
        // adds student objects to the arrayList of students
    }


    public void removeStudent (String id){   // takes argument id
        students.removeIf( p -> p.id.equals(id));
        // removes the student object with the specified  if from arrayList of students
    }

    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }
}
