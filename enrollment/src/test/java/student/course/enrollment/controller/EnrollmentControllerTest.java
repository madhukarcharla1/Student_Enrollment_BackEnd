package student.course.enrollment.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import student.course.enrollment.service.EnrollmentService;

@WebMvcTest(EnrollmentController.class)
public class EnrollmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EnrollmentService enrollmentService;

    @Test
    @WithMockUser(username = "user", password = "password", roles = "USER")
    public void testGetAllEnrollments() throws Exception {
        when(enrollmentService.getAllEnrollments()).thenReturn(new ArrayList<>());
        mockMvc.perform(get("/api/enrollments"))
                .andExpect(status().isOk());
    }
}
