package student.course.enrollment.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import student.course.enrollment.model.Enrollment;
import student.course.enrollment.repository.EnrollmentRepository;

@ExtendWith(MockitoExtension.class)
public class EnrollmentDAOTest {

    @InjectMocks
    private EnrollmentDAOImpl enrollmentDAO;

    @Mock
    private EnrollmentRepository enrollmentRepository;

    @Test
    public void testFindAll() {
        List<Enrollment> enrollments = new ArrayList<>();
        when(enrollmentRepository.findAll()).thenReturn(enrollments);
        List<Enrollment> result = enrollmentDAO.findAll();
        assertEquals(0, result.size());
    }
}
