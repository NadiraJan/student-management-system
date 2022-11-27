package be.intecbrussel.studentmanagementsystem.configs;

import be.intecbrussel.studentmanagementsystem.entity.ClassTeacher;
import be.intecbrussel.studentmanagementsystem.entity.Student;
import be.intecbrussel.studentmanagementsystem.entity.admin.User;
import be.intecbrussel.studentmanagementsystem.entity.admin.UserRepository;
import be.intecbrussel.studentmanagementsystem.repositories.ClassTeacherRepository;
import be.intecbrussel.studentmanagementsystem.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DatabaseLoader {
    private UserRepository userRepository;
    private StudentRepository studentRepository;

    public DatabaseLoader(UserRepository userRepository, StudentRepository studentRepository) {
        super();
        this.userRepository = userRepository;
        this.studentRepository = studentRepository;

    }

    @Bean
    CommandLineRunner initializeDatabase() {
        return args -> {
            User user1 = new User("liz@mail.com", "pass");

            userRepository.save(user1);



            System.out.println("Database initialized");
        };
    }
}

