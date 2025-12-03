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
import student.course.enrollment.model.Course;
import student.course.enrollment.repository.CourseRepository;

@ExtendWith(MockitoExtension.class)
public class CourseDAOTest {

    @InjectMocks
    private CourseDAOImpl courseDAO;

    @Mock
    private CourseRepository courseRepository;

    @Test
    public void testFindAll() {
        List<Course> courses = new ArrayList<>();
        when(courseRepository.findAll()).thenReturn(courses);
        List<Course> result = courseDAO.findAll();
        assertEquals(0, result.size());
    }
}
