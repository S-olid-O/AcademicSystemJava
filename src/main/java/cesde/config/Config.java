package cesde.config;

import cesde.domain.Student;
import cesde.repository.StudentRepository;
import cesde.service.StudentService;
import cesde.userinterface.MenuApp;
import cesde.view.StudentView;

public class Config {

    public static MenuApp createMenuApp() {

        Student student = new Student();
        StudentRepository studentRepository = new StudentRepository();
        StudentService studentService = new StudentService(student, studentRepository);
        StudentView studentView = new StudentView(student, studentService);

        return new MenuApp(studentView);
    }


}
