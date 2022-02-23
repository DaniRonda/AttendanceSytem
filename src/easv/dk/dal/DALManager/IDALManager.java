package easv.dk.dal.DALManager;

import easv.dk.be.Student;
import easv.dk.be.Teacher;

import java.util.List;

public interface IDALManager {

    Student createStudent(Student student);

    List<Student> getAllStudents();

    Student updateStudent(Student student);

    void deleteStudent(Student student);

    Teacher createTeacher(Teacher teacher);

    List<Teacher> getAllTeachers();

    Teacher updateTeacher(Teacher teacher);

    void deleteTeacher(Teacher teacher);

}
