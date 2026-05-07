package cesde.userinterface;

import cesde.util.TypeValidator;
import cesde.view.StudentView;
import cesde.view.TeacherView;
import cesde.view.EmployeeView;

import java.util.Scanner;

public class MenuApp {

    Scanner sc = new Scanner(System.in);

    private final StudentView studentView;
    private final TeacherView teacherView;
    private final EmployeeView employeeView;

    public MenuApp(StudentView studentView, TeacherView teacherView, EmployeeView employeeView) {
        this.studentView = studentView;
        this.teacherView = teacherView;
        this.employeeView = employeeView;
    }

    public void mainMenu() {
        System.out.println("Presione 1 para iniciar la Aplicación");
        int init = sc.nextInt();
        sc.nextLine();

        while (init != 0) {
            System.out.println("Seleccione una opción  1. Registro  2. Inicio de Sesion  3. Salir");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Registro");
                    registerMenu();
                    break;
                case 2:
                    System.out.println("Iniciar Sesión");
                    boolean token = true;
                    menuApplication(token);
                    break;
                case 3:
                    System.out.println("Salir del sistema");
                    init = 0;
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        }
    }

    //Se crea un nuevo método, debido a que el anterior pasaba directamente a crear un usuario de tipo Student
    public void registerMenu() {
        System.out.println("Tipo de usuario");
        System.out.println("Seleccione el tipo de usuario a registrar:");
        System.out.println("1. Estudiante  2. Docente  3. Empleado  4. Volver");
        int option = sc.nextInt();
        sc.nextLine();

        switch (option) {
            case 1:
                System.out.println("Registro de Estudiante");
                studentView.createStudent();
                break;
            case 2:
                System.out.println("Registro de Docente");
                teacherView.createTeacher();
                break;
            case 3:
                System.out.println("Registro de Empleado");
                employeeView.createEmployee();
                break;
            case 4:
                System.out.println("Volviendo al menú principal");
                break;
            default:
                System.out.println("Seleccione una opción válida");
        }
    }

    public void menuApplication(boolean token) {
        while (token) {
            System.out.println("Seleccione  1. Estudiante  2. Docente  3. Empleado  4. Gestion de Cursos  6. Volver");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Estudiante");
                    studentMenu();
                    break;
                case 2:
                    System.out.println("Docente");
                    teacherMenu();
                    break;
                case 3:
                    System.out.println("Empleado");
                    employeeMenu();
                    break;
                case 4:
                    System.out.println("Gestion de Cursos");
                    courseMenu();
                    break;
                case 6:
                    System.out.println("Volviendo al menú principal");
                    token = false;
                    break;
                default:
                    System.out.println("Seleccione menu valido");
            }
        }
    }

    public void courseMenu() {
        System.out.println("Menu Curso");
        boolean init = true;
        sc.nextLine();

        while (init) {
            System.out.println("1. Crear Curso  2. Actualizar curso  3. Ver Cursos  4. Ver curso por Id  5. Eliminar Curso  6. Volver");
            int opt = sc.nextInt();
            sc.nextLine();
            switch (opt) {
                case 1:
                    System.out.println("Crear Curso");
                    break;
                case 6:
                    init = false;
                    break;
                default:
                    System.out.println("Seleccione opción valida");
            }
        }
    }

    public void studentMenu() {
        System.out.println("Menu Estudiante");
        boolean init = true;
        sc.nextLine();

        while (init) {
            System.out.println("1. Crear Estudiante  2. Actualizar Estudiante  3. Ver Estudiantes  4. Ver Estudiante por Id  5. Eliminar Estudiante  6. Volver");
            int opt = sc.nextInt();
            sc.nextLine();
            switch (opt) {
                case 1:
                    System.out.println("Crear Estudiante");
                    studentView.createStudent();
                    break;
                case 2:
                    System.out.println("Actualizar Estudiante");
                    studentView.updateStudent(TypeValidator.validateInt("Ingrese el id del estudiante a actualizar"));
                    break;
                case 3:
                    System.out.println("Ver Estudiantes");
                    studentView.getAllStudents();
                    break;
                case 4:
                    System.out.println("Ver estudiante por id");
                    System.out.println("Ingrese el id del estudiante");
                    int id = sc.nextInt();
                    studentView.getStudentById(id);
                    break;
                case 5:
                    System.out.println("Eliminar Estudiante");
                    System.out.println("Ingrese el id del estudiante");
                    int idToRemove = sc.nextInt();
                    studentView.deleteStudent(idToRemove);
                    break;
                case 6:
                    System.out.println("Volviendo al menú principal");
                    init = false;
                    break;
                default:
                    System.out.println("Seleccione opción valida");
            }
        }
    }

    public void teacherMenu() {
        System.out.println("Menu Docente");
        boolean init = true;
        sc.nextLine();

        while (init) {
            System.out.println("1. Crear Docente  2. Actualizar Docente  3. Ver Docentes  4. Ver Docente por Id  5. Eliminar Docente  6. Volver");
            int opt = sc.nextInt();
            sc.nextLine();
            switch (opt) {
                case 1:
                    System.out.println("Crear Docente");
                    teacherView.createTeacher();
                    break;
                case 2:
                    System.out.println("Actualizar Docente");
                    teacherView.updateTeacher(TypeValidator.validateInt("Ingrese el id del docente a actualizar"));
                    break;
                case 3:
                    System.out.println("Ver Docentes");
                    teacherView.getAllTeachers();
                    break;
                case 4:
                    System.out.println("Ver docente por id");
                    System.out.println("Ingrese el id del docente");
                    int id = sc.nextInt();
                    teacherView.getTeacherById(id);
                    break;
                case 5:
                    System.out.println("Eliminar Docente");
                    System.out.println("Ingrese el id del docente");
                    int idToRemove = sc.nextInt();
                    teacherView.deleteTeacher(idToRemove);
                    break;
                case 6:
                    System.out.println("Volviendo al menú principal");
                    init = false;
                    break;
                default:
                    System.out.println("Seleccione opción valida");
            }
        }
    }

    public void employeeMenu() {
        System.out.println("Menu Empleado");
        boolean init = true;
        sc.nextLine();

        while (init) {
            System.out.println("1. Crear Empleado  2. Actualizar Empleado  3. Ver Empleados  4. Ver Empleado por Id  5. Eliminar Empleado  6. Volver");
            int opt = sc.nextInt();
            sc.nextLine();
            switch (opt) {
                case 1:
                    System.out.println("Crear Empleado");
                    employeeView.createEmployee();
                    break;
                case 2:
                    System.out.println("Actualizar Empleado");
                    employeeView.updateEmployee(TypeValidator.validateInt("Ingrese el id del empleado a actualizar"));
                    break;
                case 3:
                    System.out.println("Ver Empleados");
                    employeeView.getAllEmployees();
                    break;
                case 4:
                    System.out.println("Ver empleado por id");
                    System.out.println("Ingrese el id del empleado");
                    int id = sc.nextInt();
                    employeeView.getEmployeeById(id);
                    break;
                case 5:
                    System.out.println("Eliminar Empleado");
                    System.out.println("Ingrese el id del empleado");
                    int idToRemove = sc.nextInt();
                    employeeView.deleteEmployee(idToRemove);
                    break;
                case 6:
                    System.out.println("Volviendo al menú principal");
                    init = false;
                    break;
                default:
                    System.out.println("Seleccione opción valida");
            }
        }
    }
}