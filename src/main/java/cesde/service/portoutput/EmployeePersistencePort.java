package cesde.service.portoutput;

import cesde.domain.Employee;

import java.util.List;

public interface EmployeePersistencePort {

    Employee createEmployeeRepository(Employee employee);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployees();
    Employee updateEmployeeRepository(int id);
    void deleteEmployeeRepository(int id);
}