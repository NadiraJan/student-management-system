package be.intecbrussel.studentmanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Getter
@Setter
@NoArgsConstructor
public class Student extends CommonObject{
  /*  @Id
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

    @ManyToOne
    @JoinColumn(name = "classTeacher_id", referencedColumnName = "id",unique = false)
    private ClassTeacher classTeacher;

    public Student(String firstName, String lastName, String email, String password, int age, String gender,
                   String grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.grade = grade;

    }

   // @OneToOne(targetEntity = Parent.class, cascade = CascadeType.ALL)
    // private Parent parent;


    @OneToOne(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            mappedBy = "student")
    private Parent parent;

    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private Set<Results> results;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", grade='" + grade + '\'' +
                ", classTeacher=" + classTeacher +
                ", parent=" + parent +
                ", results=" + results +
                '}';
    }*/
}
