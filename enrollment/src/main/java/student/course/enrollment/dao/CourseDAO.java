package student.course.enrollment.dao;

import java.util.List;
import java.util.Optional;
import student.course.enrollment.model.Course;

public interface CourseDAO {
    Course save(Course course);

    List<Course> findAll();

    Optional<Course> findById(Long id);

    void deleteById(Long id);
}
