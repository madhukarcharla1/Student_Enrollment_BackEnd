package student.course.enrollment.service;

import java.util.List;
import java.util.Optional;
import student.course.enrollment.model.Student;

public interface StudentService {
    Student saveStudent(Student student);

    List<Student> getAllStudents();

    Optional<Student> getStudentById(Long id);

    void deleteStudentById(Long id);
}
