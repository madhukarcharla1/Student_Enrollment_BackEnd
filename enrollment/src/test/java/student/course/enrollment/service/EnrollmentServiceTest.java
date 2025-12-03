package student.course.enrollment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import student.course.enrollment.dao.EnrollmentDAO;
import student.course.enrollment.model.Enrollment;

@ExtendWith(MockitoExtension.class)
public class EnrollmentServiceTest {

    @InjectMocks
    private EnrollmentServiceImpl enrollmentService;

    @Mock
    private EnrollmentDAO enrollmentDAO;

    @Test
    public void testGetAllEnrollments() {
        List<Enrollment> enrollments = new ArrayList<>();
        when(enrollmentDAO.findAll()).thenReturn(enrollments);
        List<Enrollment> result = enrollmentService.getAllEnrollments();
        assertEquals(0, result.size());
    }
}
