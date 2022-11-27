package be.intecbrussel.studentmanagementsystem.controllers;

import be.intecbrussel.studentmanagementsystem.entity.ClassTeacher;
import be.intecbrussel.studentmanagementsystem.entity.Student;
import be.intecbrussel.studentmanagementsystem.services.interfaces.ClassTeacherService;
import be.intecbrussel.studentmanagementsystem.services.interfaces.StudentService;
import be.intecbrussel.studentmanagementsystem.services.interfaces.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class ClassTeacherController {
    @Autowired
    ClassTeacherService classTeacherService;
    @Autowired
    StudentService studentService;
    @Autowired
    TimeTableService timeTableService;

    private static Student student;

    @GetMapping("/getClassTeacherPage")
    public String adminHomePage(Model model, HttpServletResponse response, HttpServletRequest request) {
        try {

            ClassTeacher sessionAdmin = (ClassTeacher) request.getSession().getAttribute("admin");
            if (sessionAdmin != null) {
                List<Student> studentList = studentService.getAllStudents();
                model.addAttribute("studentList", studentList);
                return "classTeacherStudentCreate";
            } else {
                return "redirect:/login/Authorization";
            }
        } catch (Exception e) {
            return "redirect:/classTeacher/getClassTeacherPage";
        }
    }


}