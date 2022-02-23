package easv.dk.bll;

import easv.dk.be.Student;
import easv.dk.be.Teacher;
import easv.dk.dal.DALManager.DALManager;

import java.util.List;

public class Manager implements IManager{

    private final DALManager dalManager;

    public Manager(DALManager dalManager) {
        this.dalManager = dalManager;
    }

    @Override
    public Student createStudent(Student student) {
        return dalManager.createStudent(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return dalManager.getAllStudents();
    }

    @Override
    public Student updateStudent(Student student) {
        return dalManager.updateStudent(student);
    }

    @Override
    public void deleteStudent(Student student) {
        dalManager.deleteStudent(student);
    }

    @Override
    public Teacher createTeacher(Teacher teacher) {
        return dalManager.createTeacher(teacher);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return dalManager.getAllTeachers();
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        return dalManager.updateTeacher(teacher);
    }

    @Override
    public void deleteTeacher(Teacher teacher) {
        dalManager.deleteTeacher(teacher);

    }
}
