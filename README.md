# Student_Enrollment_BackEnd
Backend APIs to support CRUD operations for Students, Courses and Enrollments.

I have generated the REST controllers, services, DAOs, and repositories for Student, Course, and Enrollment entities. I've also configured Spring Security with an in-memory user, set up the H2 database, and added some initial unit tests.
I've added initial unit tests for the Student entity's controller, service, DAO, and repository layers.
I have generated the REST controllers for CRUD operations for Students, Courses, and Enrollments, following the layered architecture you requested (Controllers - Services - DAOs - JPA Repositories).

Here's a summary of what I've done:

-Models: Created `Student`, `Course`, and `Enrollment` entities based on the Angular application's models.
-Repositories: Created Spring Data JPA repositories for each entity.
-DAOs: Created a DAO layer with implementations that use the JPA repositories.
-Services: Created a service layer to handle business logic.
-Controllers: Created REST controllers to expose CRUD endpoints for each entity.
-Spring Security: Added basic Spring Security configuration to secure the API endpoints with HTTP Basic authentication. The default username is `user` and the password is `password`.
-H2 Database: Configured the application to use the H2 in-memory database.
-Testing: Added unit tests for the controllers, services, DAOs, and repositories.


Also committed changes later about the JWT token generation for the API calls after login. 
Added JWT dependencies to pom.xml.
Created AuthenticationRequest and AuthenticationResponse models.
Created a JwtRequestFilter to intercept and validate JWT tokens in requests.
Created a MyUserDetailsService to provide user details.
Updated SecurityConfig to integrate JWT authentication.
Created LoginController to handle the authentication and token generation.
Used BCryptPasswordEncoder for password encoding.
Run the application. To get a JWT token, For testing send a POST request to /authenticate with the following body:
{
    "username": "user",
    "password": "password"
}
Then, include the received JWT token in the Authorization header as a Bearer token for all subsequent requests to other endpoints.

