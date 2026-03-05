package cesde;

import java.util.List;
import java.util.Scanner;

public class ClassRoom {


    public  int ClassRoom;
    Scanner sc = new Scanner(System.in);

    // Atributes

    private int id;
    private int classRoom;
    private int floor;
    private boolean status;
    private int capacity;

    //Constructor

    public ClassRoom(int id, int ClassRoom, int floor, boolean status) {
        this.id = id;
        this.ClassRoom = ClassRoom;
        this.floor = floor;
        this.status = status;
    }

    // Getters And Setters

    public int getClassRoom() {
        return ClassRoom;
    }

    public int getFloor() {
        return floor;
    }

    public boolean isStatus() {
        return status;
    }

    public int getCapacity() {
        return capacity;
    }


    public int getId() {
        return id;
    }

    public void setClassRoom(int classRoom) {
        ClassRoom = classRoom;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public void setId(int id) {
        this.id = id;
    }


}
