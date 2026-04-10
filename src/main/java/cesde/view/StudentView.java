package cesde.view;

import cesde.domain.Student;
import cesde.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentView {

    Scanner sc = new Scanner(System.in);

    private final Student student;
    private final StudentService studentService;

    public StudentView(Student student, StudentService studentService){
        this.student = student;
        this.studentService = studentService; // Esto es inyeccion de dependencias
    }


    public void createStudent(){

        studentService.createStudentService();

    }

    public void getStudentById(int id){
        studentService.getStudentById(id);


    }

    public List<Student> getAllStudents(){
        return null;
    }

    public void updateStudent(){

        studentService.updateStudentService();

    }

    public void deleteStudent(int id){

    }





}
