package be.intecbrussel.studentmanagementsystem.entity.dto;

import be.intecbrussel.studentmanagementsystem.entity.ClassTeacher;
import lombok.Data;

@Data
public class ClassTeacherDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int phoneNumber;


}
