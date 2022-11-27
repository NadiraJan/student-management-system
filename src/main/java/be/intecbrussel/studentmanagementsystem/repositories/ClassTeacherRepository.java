package be.intecbrussel.studentmanagementsystem.repositories;

import be.intecbrussel.studentmanagementsystem.entity.ClassTeacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassTeacherRepository extends JpaRepository<ClassTeacher,Long> {
    ClassTeacher findByEmail(String email);


}
