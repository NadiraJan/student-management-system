package be.intecbrussel.studentmanagementsystem.entity;

import lombok.*;
import org.springframework.security.core.parameters.P;

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
    private Long phoneNumber;



    @OneToMany(mappedBy = "classTeacher",
            cascade = CascadeType.ALL)
    private Set<Student> students = new HashSet<>();







/*@OneToMany(mappedBy = "classTeacher", cascade = CascadeType.ALL)
    private Set<Parent> parents = new HashSet<>();

    public ClassTeacher(String firstName, String lastName, String email, String password, Long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }*/

  /*  public Set<Parent>getParents(){
        return parents;
    }
    public void setParents(Set<Parent> parents) {
        this.parents = parents;
        for (Parent p : parents) {
            p.setClassTeacher(this);
        }*/

/* @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "classTeacher_authority",
            joinColumns = {@JoinColumn(name = "classTeacher_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "authority_name", referencedColumnName = "name")})
    private Set<Authority> authorities = new HashSet<>();*/


}




