package student.course.enrollment.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import student.course.enrollment.model.Enrollment;

@DataJpaTest
public class EnrollmentRepositoryTest {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @Test
    public void testFindAll() {
        List<Enrollment> enrollments = enrollmentRepository.findAll();
        assertEquals(0, enrollments.size());
    }
}
