package be.intecbrussel.studentmanagementsystem.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class TimeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 255, nullable = false)
    private Subjects subjects;

    @Enumerated(EnumType.STRING)
    @Column(length = 255, nullable = false)
    private Day day;

    private LocalTime beginTime;
    private LocalTime endTime;
    private int classRoomNumber;

    public TimeTable(Subjects subjects, Day day, LocalTime beginTime,
                     LocalTime endTime, int classRoomNumber) {
        this.subjects = subjects;
        this.day = day;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.classRoomNumber = classRoomNumber;
    }

    @Override
    public String toString() {
        return "TimeTable{" +
                "subjects=" + subjects +
                ", day=" + day +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", classRoomNumber=" + classRoomNumber +
                '}';
    }
}
