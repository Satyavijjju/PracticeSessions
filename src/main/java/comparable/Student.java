package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    @Override
    public int compareTo(Student s) {
        if(id==s.id) {
            return 0;
        }else if(id>s.id){
            return 1;
        }
        else{
            return -1;
        }

    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(13,"anil"));
        students.add(new Student(10,"ronil"));
        students.add(new Student(11,"brendon"));
        students.add(new Student(9,"zian"));
        System.out.println(students);
        Collections.sort(students);
        for(Student s1:students){
            System.out.println(s1);
        }
        //Student s1 = new Student(2,"ronil");
       // students.add(s1);


    }

}

