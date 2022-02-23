package easv.dk.bll;

import easv.dk.be.Student;
import easv.dk.be.Teacher;

import java.util.List;

public interface IManager {

    Student createStudent(Student student);

    List<Student> getAllStudents();

    Student updateStudent(Student student);

    void deleteStudent(Student student);

    Student getattendance(Student student);

    Teacher createTeacher(Teacher teacher);

    List<Teacher> getAllTeachers();

    Teacher updateTeacher(Teacher teacher);

    void deleteTeacher(Teacher teacher);
}
