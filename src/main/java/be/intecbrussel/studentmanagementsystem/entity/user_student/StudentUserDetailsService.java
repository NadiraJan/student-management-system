package be.intecbrussel.studentmanagementsystem.entity.user_student;

import be.intecbrussel.studentmanagementsystem.entity.Student;
import be.intecbrussel.studentmanagementsystem.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class StudentUserDetailsService implements UserDetailsService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

       Student student = studentRepository.findByEmail(username);
        if(student == null){
            throw new UsernameNotFoundException("No student found for the given email");
        }
        return new StudentUserDetails(student);
    }
}
