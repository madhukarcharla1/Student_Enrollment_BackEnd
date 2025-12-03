package student.course.enrollment.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import student.course.enrollment.dao.CourseDAO;
import student.course.enrollment.model.Course;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseDAO courseDAO;

    public CourseServiceImpl(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    @Override
    public Course saveCourse(Course course) {
        return courseDAO.save(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseDAO.findAll();
    }

    @Override
    public Optional<Course> getCourseById(Long id) {
        return courseDAO.findById(id);
    }

    @Override
    public void deleteCourseById(Long id) {
        courseDAO.deleteById(id);
    }
}
