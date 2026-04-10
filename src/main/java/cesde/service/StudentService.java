package cesde.service;

import cesde.domain.Student;
import cesde.repository.StudentRepository;

import java.util.Scanner;

public class StudentService {

    Scanner sc = new Scanner(System.in);


    // Voy a crear una instancia unica de Student

    private final Student student;
    private final StudentRepository studentRepository;

    public StudentService(Student student, StudentRepository studentRepository){

        this.student = student;
        this.studentRepository= studentRepository;// Esto es una inyeccion de dependencias
    }


    public Student createStudentService(){

        System.out.println("Ingrese el id del Estudiente");
        int id = sc.nextInt();
        student.setId(id);
        sc.nextLine();

        System.out.println("Ingrese el Nombre del Estudiante");
        String name = sc.nextLine();
        student.setName(name);

        System.out.println("Ingrese el apellido del estudiante");
        String lastName = sc.nextLine();
        student.setLastName(lastName);


        return studentRepository.createStudentRepository(student);

    }

    public Student updateStudentService(){

        System.out.println("Seleccione el dato a actualizar \n" +
                "1. id \n" +
                "2. Nombre \n" +
                "3. Apellido \n" +
                "4. Email \n" +
                "5. Estado ");


        int option = sc.nextInt();

        sc.nextLine();

        switch (option){
            case 1:
                System.out.println("Actualizar id");
                int id = sc.nextInt();
                sc.nextLine();
                student.setId(id);
                break;
            case 2:
                System.out.println("Actualizar Nombre");
                String name = sc.nextLine();
                student.setName(name);
                break;
            default:
                System.out.println("Seleccione una opción valida");
        }


        return student;
    }

    public void getStudentById(int id) {

        if (id == student.getId()) {
            System.out.println("id:" + student.getId() + "\n" +
                    "Nombre:" + student.getName() + "\n" +
                    "Apellido " + student.getLastName() + "\n" +
                    "email: " + student.getEmail() + "\n" +
                    "Status: " + student.isStatus());
        } else {
            System.out.println("Id no encontrado");
        }
    }


}
