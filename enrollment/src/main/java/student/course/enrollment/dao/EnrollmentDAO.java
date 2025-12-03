package student.course.enrollment.dao;

import java.util.List;
import java.util.Optional;
import student.course.enrollment.model.Enrollment;

public interface EnrollmentDAO {
    Enrollment save(Enrollment enrollment);

    List<Enrollment> findAll();

    Optional<Enrollment> findById(Long id);

    void deleteById(Long id);
}
