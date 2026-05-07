package cesde.service.portinput;

import cesde.domain.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherService {

    Teacher createTeacherService();
    Teacher updateTeacherService(int id);
    Optional<Teacher> getTeacherById(int id);
    List<Teacher> getAllTeachers();
    void deleteTeacher(int id);
}