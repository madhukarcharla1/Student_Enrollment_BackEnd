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
import student.course.enrollment.dao.StudentDAO;
import student.course.enrollment.model.Student;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {

    @InjectMocks
    private StudentServiceImpl studentService;

    @Mock
    private StudentDAO studentDAO;

    @Test
    public void testGetAllStudents() {
        List<Student> students = new ArrayList<>();
        when(studentDAO.findAll()).thenReturn(students);
        List<Student> result = studentService.getAllStudents();
        assertEquals(0, result.size());
    }
}
