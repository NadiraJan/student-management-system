package be.intecbrussel.studentmanagementsystem.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class TimeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private Subjects subjects;
    private String dayOfWeek;
    private LocalTime beginTime;
    private LocalTime endTime;
    private int classRoomNumber;

    public TimeTable(Subjects subjects, String dayOfWeek, LocalTime beginTime,
                     LocalTime endTime, int classRoomNumber) {
        this.subjects = subjects;
        this.dayOfWeek = dayOfWeek;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.classRoomNumber = classRoomNumber;
    }
}
