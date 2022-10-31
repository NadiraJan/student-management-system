package be.intecbrussel.studentmanagementsystem;

import be.intecbrussel.studentmanagementsystem.entity.Student;
import be.intecbrussel.studentmanagementsystem.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

        Student student1 = new Student("Nadira", "Jan", "nadira@mail.com");
        studentRepository.save(student1);

        Student student2 = new Student("Argen", "Zhumayev", "argen@gmail.com");
        studentRepository.save(student2);

        Student student3 = new Student("Kamilla", "Bakytbekova", "kamilla@mail.net");
        studentRepository.save(student3);


    }
}