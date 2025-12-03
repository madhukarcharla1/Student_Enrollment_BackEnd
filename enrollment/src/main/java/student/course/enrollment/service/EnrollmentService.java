package student.course.enrollment.service;

import java.util.List;
import java.util.Optional;
import student.course.enrollment.model.Enrollment;

public interface EnrollmentService {
    Enrollment saveEnrollment(Enrollment enrollment);

    List<Enrollment> getAllEnrollments();

    Optional<Enrollment> getEnrollmentById(Long id);

    void deleteEnrollmentById(Long id);
}
