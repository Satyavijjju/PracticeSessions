package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student2 {
    int rollno;
    String name;
    int age;

    @Override
    public String toString() {
        return "Student2{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student2(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}
class TestComparator{
    public static void main(String[] args) {

        ArrayList<Student2> stud2 = new ArrayList<Student2>();
        stud2.add(new Student2(10,"srihaas",7));
        stud2.add(new Student2(20,"lowki",17));
        stud2.add(new Student2(30,"reyansh",27));
        stud2.add(new Student2(10,"nishal",1));
        Collections.sort(stud2,new NameComparator());
        for(Student2 y: stud2){
            System.out.println(y);
        }
    }

}
