package cesde;

import java.util.List;
import java.util.Scanner;

public class Student {

    Scanner sc = new Scanner(System.in);

    // Atributes

    private int id;
    private String name;
    private String lastName;
    private String email;
    private boolean status;

    //Constructores

    public Student(){

    }

    public Student(String email){
        this.email = email;
    }

    public Student(int id, String name,String lastName, String email, boolean status) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.status = status;
    }

    // Getters And Setters

    public int getId(){
        return this.id;
    }


    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //methods

    

    public Student createStudent(Student student){


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


        return student;

    }

    public void getStudentById(int id){

        if(id == this.id){
            System.out.println("id:" + this.id + "\n" +
                    "Nombre:" + this.name + "\n" +
                    "Apellido " + this.lastName + "\n" +
                    "email: " + this.email + "\n" +
                    "Statu");
        }else{
            System.out.println("Id no encontrado");
        }

    }

    public List<Student> getAllStudents(){
        return null;
    }

    public Student updateStudent(Student student){
        return student;
    }

    public void deleteStudent(int id){

    }

}
