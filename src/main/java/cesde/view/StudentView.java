package cesde.view;

import cesde.domain.Student;
import cesde.service.StudentServiceImpl;

import java.util.List;
import java.util.Scanner;

public class StudentView {

    Scanner sc = new Scanner(System.in);

    private final Student student;
    private final StudentServiceImpl studentServiceImpl;

    public StudentView(Student student, StudentServiceImpl studentServiceImpl){
        this.student = student;
        this.studentServiceImpl = studentServiceImpl; // Esto es inyeccion de dependencias
    }


    public void createStudent(){

        studentServiceImpl.createStudentService();

    }

    public void getStudentById(int id){
        studentServiceImpl.getStudentById(id);


    }

    public List<Student> getAllStudents(){
        return null;
    }

    public void updateStudent(){

        studentServiceImpl.updateStudentService();

    }

    public void deleteStudent(int id){

    }





}
