package cesde.service;

import cesde.domain.Teacher;
import cesde.persistence.repository.TeacherRepository;
import cesde.service.portinput.TeacherService;
import cesde.util.TypeValidator;

import java.util.List;
import java.util.Optional;

public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository; // Inyección de dependencias
    }

    @Override
    public Teacher createTeacherService() {
        Teacher teacher = new Teacher();
        teacher.setId(TypeValidator.validateInt("Ingrese el id del docente"));
        teacher.setName(TypeValidator.validateString("Ingrese el nombre del docente"));
        teacher.setLastName(TypeValidator.validateString("Ingrese el apellido del docente"));
        teacher.setEmail(TypeValidator.validateString("Ingrese el email del docente"));
        teacher.setStatus(TypeValidator.validateBoolean("Seleccione un estado"));
        teacher.setSpeciality(TypeValidator.validateString("Ingrese la especialidad del docente"));
        return teacherRepository.createTeacherRepository(teacher);
    }

    @Override
    public Teacher updateTeacherService(int id) {
        Teacher teacher = teacherRepository.getTeacherById(id);
        if (teacher != null && id == teacher.getId()) {
            System.out.println("Seleccione el dato a actualizar \n" +
                    "1. id \n" +
                    "2. Nombre \n" +
                    "3. Apellido \n" +
                    "4. Email \n" +
                    "5. Estado \n" +
                    "6. Especialidad");
            int option = TypeValidator.validateInt("Opcion: ");
            switch (option) {
                case 1:
                    teacher.setId(TypeValidator.validateInt("Actualizar id"));
                    break;
                case 2:
                    teacher.setName(TypeValidator.validateString("Actualizar Nombre"));
                    break;
                case 3:
                    teacher.setLastName(TypeValidator.validateString("Actualizar Apellido"));
                    break;
                case 4:
                    teacher.setEmail(TypeValidator.validateString("Actualizar Email"));
                    break;
                case 5:
                    teacher.setStatus(TypeValidator.validateBoolean("Actualizar Estado"));
                    break;
                case 6:
                    teacher.setSpeciality(TypeValidator.validateString("Actualizar Especialidad"));
                    break;
                default:
                    System.out.println("Seleccione una opción válida");
            }
        }
        return teacher;
    }

    @Override
    public Optional<Teacher> getTeacherById(int id) {
        Teacher teacher = teacherRepository.getTeacherById(id);
        if (teacher != null && id == teacher.getId()) {
            System.out.println("id: " + teacher.getId() + "\n" +
                    "Nombre: " + teacher.getName() + "\n" +
                    "Apellido: " + teacher.getLastName() + "\n" +
                    "Email: " + teacher.getEmail() + "\n" +
                    "Status: " + teacher.isStatus() + "\n" +
                    "Especialidad: " + teacher.getSpeciality());
        } else {
            System.out.println("Id no encontrado");
        }
        return Optional.ofNullable(teacher);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.getAllTeachers();
    }

    @Override
    public void deleteTeacher(int id) {
        System.out.println("Estoy en el service");
        teacherRepository.deleteTeacherRepository(id);
    }
}