package student.course.enrollment.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import student.course.enrollment.model.Enrollment;
import student.course.enrollment.repository.EnrollmentRepository;

@Repository
public class EnrollmentDAOImpl implements EnrollmentDAO {

    private final EnrollmentRepository repository;

    public EnrollmentDAOImpl(EnrollmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Enrollment save(Enrollment enrollment) {
        return repository.save(enrollment);
    }

    @Override
    public List<Enrollment> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Enrollment> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
