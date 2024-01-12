package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Student1 implements Comparable<Student1> {
    int id;
    String name;
    int rollno;

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }

    public Student1(int id, String name, int rollno) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public int compareTo(Student1 s1) {
        if (rollno == s1.rollno) {
            return 0;
        } else if (rollno > s1.rollno) {
            return 1;
        } else {
            return -1;
        }
    }
}
class Test{
    public static void main(String[] args) {
        ArrayList<Student1> stud1 = new ArrayList<Student1>();
        stud1.add(new Student1(412,"Srihaas",01));
        stud1.add(new Student1(112,"brendon",02));
        stud1.add(new Student1(102,"matteo",03));
     Collections.sort(stud1);

for(Student1 s2 : stud1){
    System.out.println(s2);
}
    }

    }

