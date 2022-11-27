package be.intecbrussel.studentmanagementsystem.entity.dto;

import be.intecbrussel.studentmanagementsystem.entity.Student;
import be.intecbrussel.studentmanagementsystem.entity.user_student.StudentUserDetails;
import lombok.Data;

import java.util.List;
@Data
public class StudentUserDetailsDto {
    public List<Student> students;
    public List<StudentUserDetails> studentDetails;
}
