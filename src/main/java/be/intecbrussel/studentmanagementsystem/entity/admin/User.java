package be.intecbrussel.studentmanagementsystem.entity.admin;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.aspectj.weaver.GeneratedReferenceTypeDelegate;


import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;



    public User(String email, String password) {
        this.email = email;
        this.password = password;

    }
}
