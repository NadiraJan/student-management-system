package be.intecbrussel.studentmanagementsystem.repositories;

import be.intecbrussel.studentmanagementsystem.entity.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.security.auth.Subject;
@Repository
public interface TimeTableRepository extends JpaRepository<TimeTable, Long> {
}
