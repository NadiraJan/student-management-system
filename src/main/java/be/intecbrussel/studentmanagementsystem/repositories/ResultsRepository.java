package be.intecbrussel.studentmanagementsystem.repositories;

import be.intecbrussel.studentmanagementsystem.entity.Results;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultsRepository extends JpaRepository<Results,Long> {
}
