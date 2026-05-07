package cesde.view;

import cesde.domain.Teacher;
import cesde.service.TeacherServiceImpl;

import java.util.List;

public class TeacherView {

    private final TeacherServiceImpl teacherServiceImpl;

    public TeacherView(TeacherServiceImpl teacherServiceImpl) {
        this.teacherServiceImpl = teacherServiceImpl; // Inyección de dependencias
    }

    public void createTeacher() {
        teacherServiceImpl.createTeacherService();
    }

    public void getTeacherById(int id) {
        teacherServiceImpl.getTeacherById(id);
    }

    public List<Teacher> getAllTeachers() {
        return teacherServiceImpl.getAllTeachers();
    }

    public void updateTeacher(int id) {
        teacherServiceImpl.updateTeacherService(id);
    }

    public void deleteTeacher(int id) {
        System.out.println("Estoy en el view");
        teacherServiceImpl.deleteTeacher(id);
    }
}