package cesde.service.portinput;

import cesde.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee createEmployeeService();
    Employee updateEmployeeService(int id);
    Optional<Employee> getEmployeeById(int id);
    List<Employee> getAllEmployees();
    void deleteEmployee(int id);
}