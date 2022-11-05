package be.intecbrussel.studentmanagementsystem.services.interfaces;

import be.intecbrussel.studentmanagementsystem.StudentManagementSystemApplication;
import be.intecbrussel.studentmanagementsystem.entity.Student;
import be.intecbrussel.studentmanagementsystem.repositories.StudentRepository;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);


}