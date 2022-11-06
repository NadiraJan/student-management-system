package be.intecbrussel.studentmanagementsystem;
import be.intecbrussel.studentmanagementsystem.entity.*;
import be.intecbrussel.studentmanagementsystem.repositories.*;
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
    @Autowired
    private ClassTeacherRepository classTeacherRepository;
    @Autowired
    private ParentRepository parentRepository;
    @Autowired
    private TimeTableRepository timeTableRepository;


    @Override
    public void run(String... args) throws Exception {


        Student student1 = new Student("John", "Jackson", "john@mail.com", "password",
                13, "Boy", "2AC");
        studentRepository.save(student1);


        ClassTeacher classTeacher1 = new ClassTeacher("Ann", "Sels", "sels@mail.net", "password1");
        classTeacherRepository.save(classTeacher1);


        Parent parent = new Parent("Jack", "Jackson", "jacksons", "password", "father");
        parentRepository.save(parent);


        student1.setClassTeacher(classTeacher1);
        student1.setParent(parent);
        parent.setStudent(student1);




    }
}