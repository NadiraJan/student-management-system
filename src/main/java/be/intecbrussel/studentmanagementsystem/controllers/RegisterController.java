package be.intecbrussel.studentmanagementsystem.controllers;

import be.intecbrussel.studentmanagementsystem.entity.Student;
import be.intecbrussel.studentmanagementsystem.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/register")
    public String getRegisterStudent(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "register";

    }

    @PostMapping("/register")
    public String registerNewStudent(@ModelAttribute Student student, Model model) {
        studentRepository.save(student);
        return "redirect:/";

    }


}
