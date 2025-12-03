package student.course.enrollment.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import student.course.enrollment.dao.StudentDAO;
import student.course.enrollment.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentDAO studentDAO;

    public StudentServiceImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentDAO.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDAO.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentDAO.findById(id);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentDAO.deleteById(id);
    }
}
