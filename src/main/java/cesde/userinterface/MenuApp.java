package cesde.userinterface;

import cesde.domain.Student;
import cesde.view.StudentView;

import java.util.Scanner;

public class MenuApp {

    Scanner sc = new Scanner(System.in);

    private final StudentView studentView;

    public MenuApp(StudentView studentView){
        this.studentView = studentView;
    }


   public void mainMenu(){

       System.out.println("Presione 1 para iniciar la Aplicación");

       int init = sc.nextInt();

       sc.nextLine();

       while(init != 0){

           System.out.println("Seleccione una opción 1. Registro 2. Inicio de Sesion 3. Salir ");

           int option = sc.nextInt();

           sc.nextLine();

           switch (option){

               case 1:
                   System.out.println("Crear usuario");
                   studentView.createStudent();
                   break;
               case 2:
                   System.out.println("Iniciar Sesion");
                   courseMenu();
                   break;
               case 3:
                   System.out.println("Salir del sistema ");
                   init = 0;
               default:
                   System.out.println("Ingrese una opción valida");
           }
       }

   }


   public void courseMenu(){

       System.out.println("Menu Curso");
       boolean init = true;
       sc.nextLine();

       while(init){
           System.out.println("1. Crear Curso 2. Actualizar curso 3. ver Cursos 4. Ver curso por Id 5. Eliminar Curso 6. Volver");

           int opt = sc.nextInt();
           sc.nextLine();
           switch (opt){
               case 1:
                   System.out.println("Crear Curso");
                   break;
               case 6:
                   init = false;
               default:
                   System.out.println("Seleccione opción valida");
           }
       }
   }


}
