package student.course.enrollment.service;

import java.util.List;
import java.util.Optional;
import student.course.enrollment.model.Course;

public interface CourseService {
    Course saveCourse(Course course);

    List<Course> getAllCourses();

    Optional<Course> getCourseById(Long id);

    void deleteCourseById(Long id);
}
