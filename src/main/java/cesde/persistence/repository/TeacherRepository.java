package cesde.persistence.repository;

import cesde.domain.Teacher;
import cesde.service.portoutput.TeacherPersistencePort;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements TeacherPersistencePort {

    List<Teacher> teachers = new ArrayList<>();

    @Override
    public Teacher createTeacherRepository(Teacher teacher) {
        teachers.add(teacher);
        for (Teacher t : teachers) {
            System.out.println(t.getId() + " " + t.getName() + " " + t.getLastName() + " - Especialidad: " + t.getSpeciality());
        }
        return teacher;
    }

    @Override
    public Teacher getTeacherById(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }
        return null;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getId() + " " + teacher.getName() + " " + teacher.getLastName() + " - Especialidad: " + teacher.getSpeciality());
        }
        return teachers;
    }

    @Override
    public Teacher updateTeacherRepository(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }
        return null;
    }

    @Override
    public void deleteTeacherRepository(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                teachers.remove(teacher);
                System.out.println("Docente eliminado");
                return;
            }
        }
        System.out.println("Docente no encontrado");
    }
}