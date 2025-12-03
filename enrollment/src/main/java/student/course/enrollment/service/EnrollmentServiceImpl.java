package student.course.enrollment.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import student.course.enrollment.dao.EnrollmentDAO;
import student.course.enrollment.model.Enrollment;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

    private final EnrollmentDAO enrollmentDAO;

    public EnrollmentServiceImpl(EnrollmentDAO enrollmentDAO) {
        this.enrollmentDAO = enrollmentDAO;
    }

    @Override
    public Enrollment saveEnrollment(Enrollment enrollment) {
        return enrollmentDAO.save(enrollment);
    }

    @Override
    public List<Enrollment> getAllEnrollments() {
        return enrollmentDAO.findAll();
    }

    @Override
    public Optional<Enrollment> getEnrollmentById(Long id) {
        return enrollmentDAO.findById(id);
    }

    @Override
    public void deleteEnrollmentById(Long id) {
        enrollmentDAO.deleteById(id);
    }
}
