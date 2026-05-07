package cesde.domain;

public class Employee extends User {

    private String position;

    public Employee() {
        super();
    }

    public Employee(int id, String name, String lastName, String email, String phone, String password, boolean status, String position) {
        super(id, name, lastName, email, phone, password, status);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}