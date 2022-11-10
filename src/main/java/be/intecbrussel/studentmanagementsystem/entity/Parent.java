package be.intecbrussel.studentmanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;


@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Getter
@Setter
@NoArgsConstructor
public class Parent extends CommonObject{
 /*   @Id
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

    @Override
    public String toString() {
        return "Parent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", relation='" + relation + '\'' +
                ", student=" + student +
                '}';
    }*/
}
