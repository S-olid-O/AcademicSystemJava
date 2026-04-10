package cesde.repository;

import cesde.domain.Student;


import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    ArrayList<Student> students = new ArrayList<>();

    public Student createStudentRepository(Student student){

        students.add(student);

        for (Student student1: students) {
            System.out.println(student1.getId() + " " + student1.getName() + " " + student1.getLastName());
        }

        return student;

    }



}
