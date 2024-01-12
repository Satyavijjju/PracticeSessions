package comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
        int age;
        String name;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
 class Demo{
    public static void main(String[] args) {
        Comparator<Student> com = (Student i, Student j) ->{
//
//                if(i.age> j.age)
//
//                return 1;
//
//                else
//                    return -1;
            return i.age>j.age?1:-1;


        };

        List<Student> stud = new ArrayList<>();
        stud.add(new Student(31,"satya"));
        stud.add(new Student(29,"jyo"));
        stud.add(new Student(33,"laxmi"));
        Collections.sort(stud,com);
      //  stud.forEach(n-> System.out.println(n));
        for(Student s : stud){
            System.out.println(s);
        }




    }
}

