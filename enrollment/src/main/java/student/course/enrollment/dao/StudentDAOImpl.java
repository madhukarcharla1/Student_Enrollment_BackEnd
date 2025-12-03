package student.course.enrollment.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import student.course.enrollment.model.Student;
import student.course.enrollment.repository.StudentRepository;

@Repository
public class StudentDAOImpl implements StudentDAO {

    private final StudentRepository repository;

    public StudentDAOImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student save(Student student) {
        return repository.save(student);
    }

    @Override
    public List<Student> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
