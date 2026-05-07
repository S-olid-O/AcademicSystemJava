package cesde.config;

import cesde.persistence.repository.EmployeeRepository;
import cesde.persistence.repository.StudentRepository;
import cesde.persistence.repository.TeacherRepository;
import cesde.service.EmployeeServiceImpl;
import cesde.service.StudentServiceImpl;
import cesde.service.TeacherServiceImpl;
import cesde.userinterface.MenuApp;
import cesde.view.EmployeeView;
import cesde.view.StudentView;
import cesde.view.TeacherView;

public class Config {

    public static MenuApp createMenuApp() {


        StudentRepository studentRepository = new StudentRepository();
        StudentServiceImpl studentServiceImpl = new StudentServiceImpl( studentRepository);
        StudentView studentView = new StudentView(studentServiceImpl);

        TeacherRepository teacherRepository = new TeacherRepository();
        TeacherServiceImpl teacherServiceImpl = new TeacherServiceImpl(teacherRepository);
        TeacherView teacherView= new TeacherView(teacherServiceImpl);

        EmployeeRepository employeeRepository = new EmployeeRepository();
        EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl(employeeRepository);
        EmployeeView employeeView= new EmployeeView(employeeServiceImpl);

        return new MenuApp(studentView, teacherView, employeeView);
    }


}
