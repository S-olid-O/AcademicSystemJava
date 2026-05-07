package cesde.view;

import cesde.domain.Employee;
import cesde.service.EmployeeServiceImpl;

import java.util.List;

public class EmployeeView {

    private final EmployeeServiceImpl employeeServiceImpl;

    public EmployeeView(EmployeeServiceImpl employeeServiceImpl) {
        this.employeeServiceImpl = employeeServiceImpl; // Inyección de dependencias
    }

    public void createEmployee() {
        employeeServiceImpl.createEmployeeService();
    }

    public void getEmployeeById(int id) {
        employeeServiceImpl.getEmployeeById(id);
    }

    public List<Employee> getAllEmployees() {
        return employeeServiceImpl.getAllEmployees();
    }

    public void updateEmployee(int id) {
        employeeServiceImpl.updateEmployeeService(id);
    }

    public void deleteEmployee(int id) {
        System.out.println("Estoy en el view");
        employeeServiceImpl.deleteEmployee(id);
    }
}