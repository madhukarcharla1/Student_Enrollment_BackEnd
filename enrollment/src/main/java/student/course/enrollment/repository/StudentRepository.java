package student.course.enrollment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import student.course.enrollment.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
