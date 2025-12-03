package student.course.enrollment.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import student.course.enrollment.model.Course;
import student.course.enrollment.repository.CourseRepository;

@Repository
public class CourseDAOImpl implements CourseDAO {

    private final CourseRepository repository;

    public CourseDAOImpl(CourseRepository repository) {
        this.repository = repository;
    }

    @Override
    public Course save(Course course) {
        return repository.save(course);
    }

    @Override
    public List<Course> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Course> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
