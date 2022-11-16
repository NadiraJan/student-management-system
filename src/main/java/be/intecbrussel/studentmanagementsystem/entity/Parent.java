package be.intecbrussel.studentmanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;


@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String relation;




    @OneToOne(fetch = FetchType.LAZY)
    private Student student;

 /*  @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "classTeacher_id")
    private ClassTeacher classTeacher;



    }*/


}

