package student.course.enrollment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import student.course.enrollment.model.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
