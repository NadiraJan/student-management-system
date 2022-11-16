package be.intecbrussel.studentmanagementsystem.services;

import be.intecbrussel.studentmanagementsystem.entity.Student;
import be.intecbrussel.studentmanagementsystem.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*@Component("studentDetailsService")
public class StudentDetailsService implements UserDetailsService {
    @Autowired
    private StudentRepository studentRepository;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Student> optionalStudent = Optional.ofNullable(studentRepository.findByEmail(email));
        if(!optionalStudent.isPresent()){
            throw new UsernameNotFoundException("Student not found");
        }

  /*      Student student = optionalStudent.get();

     List<GrantedAuthority>grantedAuthorities = student
                .getAuthorities()
                .stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getName()))
                .collect(Collectors.toList());



       return new org.springframework.security.core.userdetails.User(student.getEmail(),student.getPassword(),grantedAuthorities);



    }
}*/
