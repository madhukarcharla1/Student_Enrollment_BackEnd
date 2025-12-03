package student.course.enrollment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import student.course.enrollment.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
