package be.intecbrussel.studentmanagementsystem.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String relation;

    public Parent(String firstName, String lastName, String userName, String password, String relation) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.relation = relation;
    }

    @OneToOne(fetch = FetchType.EAGER)
    private Student student;
}
