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
import student.course.enrollment.dao.CourseDAO;
import student.course.enrollment.model.Course;

@ExtendWith(MockitoExtension.class)
public class CourseServiceTest {

    @InjectMocks
    private CourseServiceImpl courseService;

    @Mock
    private CourseDAO courseDAO;

    @Test
    public void testGetAllCourses() {
        List<Course> courses = new ArrayList<>();
        when(courseDAO.findAll()).thenReturn(courses);
        List<Course> result = courseService.getAllCourses();
        assertEquals(0, result.size());
    }
}
