package be.intecbrussel.studentmanagementsystem.controllers;

import be.intecbrussel.studentmanagementsystem.entity.ClassTeacher;
import be.intecbrussel.studentmanagementsystem.services.interfaces.ClassTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
    @Autowired
    private ClassTeacherService classTeacherService;
    @GetMapping("/register")
    public String getRegisterPage(Model model){
        ClassTeacher classTeacher = new ClassTeacher();
        model.addAttribute("classTeacher", classTeacher);
        return "teacher_register";
    }
    @PostMapping("/register")
    public String registerNewClassTeacher(@ModelAttribute ClassTeacher classTeacher,Model model){
        classTeacherService.save(classTeacher);
        return "redirect:/";
    }


}
