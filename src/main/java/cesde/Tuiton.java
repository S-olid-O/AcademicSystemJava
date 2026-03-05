package cesde;


import java.util.List;
import java.util.Scanner;

public class Tuiton {

    Scanner sc = new Scanner(System.in);

    // Atributes


    private int id;
    private String nameSchool;
    private String director;

    //Constructor

    public Tuiton(int id, String nameSchool, String director) {
        this.id = id;
        this.nameSchool = nameSchool;
        this.director = director;
    }

    // Getters And Setters

    public int getId() {
        return id;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public String getDirector() {
        return director;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}
