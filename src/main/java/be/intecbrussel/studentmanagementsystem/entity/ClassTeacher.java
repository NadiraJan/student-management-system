package be.intecbrussel.studentmanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Getter
@Setter
@NoArgsConstructor
public class ClassTeacher extends CommonObject {

  /*  @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

 /* @OneToMany(mappedBy = "classTeacher")
    @JoinColumn(name = "classTeacher_id")
   private List<Student> students;*/

 /*   @OneToMany(mappedBy = "classTeacher", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private Set<Student> students;*/


   /* @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "classTeacher_authority",
            joinColumns = {@JoinColumn(name = "classTeacher_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "authority_name", referencedColumnName = "name")})
    private Set<Authority> authorities = new HashSet<>();*/


   /* public ClassTeacher(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }*/

  /*  @Override
    public String toString() {
        return "ClassTeacher{" +

                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", students=" + students +
                '}';
    }*/
}
