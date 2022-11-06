package be.intecbrussel.studentmanagementsystem.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.security.auth.Subject;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Results {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
   //private String nameOfSubject;
    private Long id;
    private double maxPoint;
    private Subjects subjects;
    private String remarks;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

    public Results(double maxPoint, Subjects subjects, String remarks, Student student) {
        this.maxPoint = maxPoint;
        this.subjects = subjects;
        this.remarks = remarks;
        this.student = student;
    }
}
