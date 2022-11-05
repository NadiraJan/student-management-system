package be.intecbrussel.studentmanagementsystem.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.PageRequest;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "students")
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


    @ManyToOne
    @JoinColumn(name = "classTeacher_id", referencedColumnName = "id")
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

    @OneToOne(targetEntity = Parent.class, cascade = CascadeType.ALL)
    private Parent parent;


 /* @OneToOne(fetch = FetchType.EAGER,
  cascade = CascadeType.ALL,
  mappedBy = "student")
  private Parent parent;*/

   /* @OneToMany
    @JoinColumn(name = "results_id", referencedColumnName = "id")
    private Results results;*/
}
