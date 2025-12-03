package student.course.enrollment;

import org.springframework.boot.SpringApplication;

public class TestEnrollmentApplication {

	public static void main(String[] args) {
		SpringApplication.from(EnrollmentApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
