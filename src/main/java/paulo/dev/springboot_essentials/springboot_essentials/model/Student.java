package paulo.dev.springboot_essentials.springboot_essentials.model;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

public class Student {
    private String name;
    private int id;
    public static List<Student> studentList;
    
static {
    studentRepository();
}

    public Student(String name, int id) {
        this(name);
        this.id = id;
    }

    public Student(String name) {
        this.name = name;
    }
    public Student (){
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    private static void studentRepository () {
        studentList = new ArrayList<>(asList(new Student("Wagner",1), new Student("Pedro",2)));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
