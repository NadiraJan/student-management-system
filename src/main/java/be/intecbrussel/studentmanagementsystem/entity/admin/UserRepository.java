package be.intecbrussel.studentmanagementsystem.entity.admin;

import be.intecbrussel.studentmanagementsystem.entity.admin.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String email);
}
