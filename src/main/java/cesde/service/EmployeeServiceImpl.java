package cesde.service;

import cesde.domain.Employee;
import cesde.persistence.repository.EmployeeRepository;
import cesde.service.portinput.EmployeeService;
import cesde.util.TypeValidator;

import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository; // Inyección de dependencias
    }

    @Override
    public Employee createEmployeeService() {
        Employee employee = new Employee();
        employee.setId(TypeValidator.validateInt("Ingrese el id del empleado"));
        employee.setName(TypeValidator.validateString("Ingrese el nombre del empleado"));
        employee.setLastName(TypeValidator.validateString("Ingrese el apellido del empleado"));
        employee.setEmail(TypeValidator.validateString("Ingrese el email del empleado"));
        employee.setStatus(TypeValidator.validateBoolean("Seleccione un estado"));
        employee.setPosition(TypeValidator.validateString("Ingrese el cargo del empleado"));
        return employeeRepository.createEmployeeRepository(employee);
    }

    @Override
    public Employee updateEmployeeService(int id) {
        Employee employee = employeeRepository.getEmployeeById(id);
        if (employee != null && id == employee.getId()) {
            System.out.println("Seleccione el dato a actualizar \n" +
                    "1. id \n" +
                    "2. Nombre \n" +
                    "3. Apellido \n" +
                    "4. Email \n" +
                    "5. Estado \n" +
                    "6. Cargo");
            int option = TypeValidator.validateInt("Opcion: ");
            switch (option) {
                case 1:
                    employee.setId(TypeValidator.validateInt("Actualizar id"));
                    break;
                case 2:
                    employee.setName(TypeValidator.validateString("Actualizar Nombre"));
                    break;
                case 3:
                    employee.setLastName(TypeValidator.validateString("Actualizar Apellido"));
                    break;
                case 4:
                    employee.setEmail(TypeValidator.validateString("Actualizar Email"));
                    break;
                case 5:
                    employee.setStatus(TypeValidator.validateBoolean("Actualizar Estado"));
                    break;
                case 6:
                    employee.setPosition(TypeValidator.validateString("Actualizar Cargo"));
                    break;
                default:
                    System.out.println("Seleccione una opción válida");
            }
        }
        return employee;
    }

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        Employee employee = employeeRepository.getEmployeeById(id);
        if (employee != null && id == employee.getId()) {
            System.out.println("id: " + employee.getId() + "\n" +
                    "Nombre: " + employee.getName() + "\n" +
                    "Apellido: " + employee.getLastName() + "\n" +
                    "Email: " + employee.getEmail() + "\n" +
                    "Status: " + employee.isStatus() + "\n" +
                    "Cargo: " + employee.getPosition());
        } else {
            System.out.println("Id no encontrado");
        }
        return Optional.ofNullable(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    @Override
    public void deleteEmployee(int id) {
        System.out.println("Estoy en el service");
        employeeRepository.deleteEmployeeRepository(id);
    }
}