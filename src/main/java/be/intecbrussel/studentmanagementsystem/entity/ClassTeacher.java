package be.intecbrussel.studentmanagementsystem.entity;

import be.intecbrussel.studentmanagementsystem.entity.dto.ClassTeacherDto;
import lombok.*;


import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class ClassTeacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int phoneNumber;


    @OneToMany(mappedBy = "classTeacher",
            cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Student> students = new HashSet<>();




}




