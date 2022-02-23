package easv.dk.dal.DALManager;

import easv.dk.be.Student;
import easv.dk.be.Teacher;
import easv.dk.dal.StudentDAO;
import easv.dk.dal.TeacherDAO;

import java.util.List;

public class DALManager implements IDALManager {


    private final StudentDAO studentDAO;
    private final TeacherDAO teacherDAO;

    public DALManager(StudentDAO studentDAO, TeacherDAO teacherDAO){
        this.studentDAO = studentDAO;
        this.teacherDAO = teacherDAO;
    }
    @Override
    public Student createStudent(Student student) {
        return studentDAO.createStudent(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentDAO.updateStudent(student);
    }

    @Override
    public void deleteStudent(Student student) {
        studentDAO.deleteStudent(student);
    }

    @Override
    public Teacher createTeacher(Teacher teacher) {
        return teacherDAO.createTeacher(teacher);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherDAO.getAllTeachers();
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        return teacherDAO.updateTeacher(teacher);
    }

    @Override
    public void deleteTeacher(Teacher teacher) {
        teacherDAO.deleteTeacher(teacher);

    }
}
