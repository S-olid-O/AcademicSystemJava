package cesde;

import java.util.List;
import java.util.Scanner;

public class Course {

    Scanner sc = new Scanner(System.in);

    // Atributes

    private int id;
    private String name;
    private String programa;
    private String school;
    private String teacher;
    private String starDate;
    private String endDate;

    //Constructor

    public Course(int id, String name, String programa, String school, String teacher, String starDate , String endDate) {
        this.id = id;
        this.name = name;
        this.programa = programa;
        this.school = school;
        this.teacher = teacher;
        this.starDate = starDate;
        this.endDate = endDate;
    }

    // Getters And Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setStarDate(String starDate) {
        this.starDate = starDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrograma() {
        return programa;
    }

    public String getSchool() {
        return school;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getStarDate() {
        return starDate;
    }

    public String getEndDate() {
        return endDate;
    }

}
