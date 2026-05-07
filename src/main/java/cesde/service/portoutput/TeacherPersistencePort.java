package cesde.service.portoutput;

import cesde.domain.Teacher;

import java.util.List;

public interface TeacherPersistencePort {

    Teacher createTeacherRepository(Teacher teacher);
    Teacher getTeacherById(int id);
    List<Teacher> getAllTeachers();
    Teacher updateTeacherRepository(int id);
    void deleteTeacherRepository(int id);
}