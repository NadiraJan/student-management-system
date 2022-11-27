package be.intecbrussel.studentmanagementsystem.controllers;

import be.intecbrussel.studentmanagementsystem.entity.ClassTeacher;
import be.intecbrussel.studentmanagementsystem.entity.Student;
import be.intecbrussel.studentmanagementsystem.entity.TimeTable;
import be.intecbrussel.studentmanagementsystem.entity.dto.LoginDto;
import be.intecbrussel.studentmanagementsystem.entity.handler.ChatMessage;
import be.intecbrussel.studentmanagementsystem.services.interfaces.ClassTeacherService;
import be.intecbrussel.studentmanagementsystem.services.interfaces.StudentService;
import be.intecbrussel.studentmanagementsystem.services.interfaces.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class HomeController {

    @GetMapping("/")
    public String viewHomePage(Model model) {
        return "home";
    }

    @GetMapping("/admin/login")
    public String viewAdminLoginPage() {
        return "admin/admin_login";
    }

    @GetMapping("/admin/home")
    public String viewAdminHomePage(){
        return "admin/admin_home";

    }

    @GetMapping("/student/login")
    public String viewUserLoginPage() {
        return "student/student_login";
    }

 @GetMapping("/student/home")
    public String viewStudentHomePage() {
        return "student/student_home";
    }




    }




