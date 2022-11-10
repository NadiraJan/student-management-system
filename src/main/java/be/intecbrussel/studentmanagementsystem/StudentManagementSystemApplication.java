package be.intecbrussel.studentmanagementsystem;

import be.intecbrussel.studentmanagementsystem.entity.*;
import be.intecbrussel.studentmanagementsystem.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;


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
    @Autowired
    private ResultsRepository resultsRepository;


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


        Results results = new Results(99.9, Subjects.MATHEMATICS, "Awesome", student1);
        resultsRepository.save(results);

  Results results1 = new Results(35.5, Subjects.BIOLOGY, "Not succeed", student1);
        Results results2 = new Results(66.2, Subjects.ECONOMY, "Satisfied", student1);
        Results results3 = new Results(80.0, Subjects.GEOGRAPHY, "Good", student1);
        Results results4 = new Results(77.6, Subjects.HISTORY, "Good", student1);
        Results results5 = new Results(78.0, Subjects.INFORMATICS, "Good", student1);
        results.setStudent(student1);
        results1.setStudent(student1);
        results2.setStudent(student1);
        results3.setStudent(student1);
        results4.setStudent(student1);
        results5.setStudent(student1);



    }
}