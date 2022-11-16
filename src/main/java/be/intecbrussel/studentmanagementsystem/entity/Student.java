package be.intecbrussel.studentmanagementsystem.entity;

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
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "age", nullable = false)
    private int age;
    @Column(name = "gender", nullable = false)
    private String gender;
    @Column(name = "grade", nullable = false)
    private String grade;




    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "classTeacher_id")
    private ClassTeacher classTeacher;

    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "student")
    private Parent parent;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Results> results;

   @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "student_authority", joinColumns = @JoinColumn(
            name = "student_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "authority_name",
                    referencedColumnName = "name"))
    private Set<Authority> authorities = new HashSet<>();

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                 ", authorities=" + authorities +
                '}';
    }
}

