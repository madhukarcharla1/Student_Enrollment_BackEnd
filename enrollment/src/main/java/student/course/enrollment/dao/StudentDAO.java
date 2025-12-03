package student.course.enrollment.dao;

import java.util.List;
import java.util.Optional;
import student.course.enrollment.model.Student;

public interface StudentDAO {
    Student save(Student student);

    List<Student> findAll();

    Optional<Student> findById(Long id);

    void deleteById(Long id);
}
