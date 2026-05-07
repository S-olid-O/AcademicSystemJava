package cesde.persistence.repository;

import cesde.domain.Employee;
import cesde.service.portoutput.EmployeePersistencePort;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements EmployeePersistencePort {

    List<Employee> employees = new ArrayList<>();

    @Override
    public Employee createEmployeeRepository(Employee employee) {
        employees.add(employee);
        for (Employee e : employees) {
            System.out.println(e.getId() + " " + e.getName() + " " + e.getLastName() + " - Cargo: " + e.getPosition());
        }
        return employee;
    }

    @Override
    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getLastName() + " - Cargo: " + employee.getPosition());
        }
        return employees;
    }

    @Override
    public Employee updateEmployeeRepository(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void deleteEmployeeRepository(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                System.out.println("Empleado eliminado");
                return;
            }
        }
        System.out.println("Empleado no encontrado");
    }
}