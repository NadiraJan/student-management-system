package be.intecbrussel.studentmanagementsystem.controllers;

import be.intecbrussel.studentmanagementsystem.entity.ClassTeacher;
import be.intecbrussel.studentmanagementsystem.services.interfaces.ClassTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;


@Controller
public class HomeController {

    @GetMapping("/login")
    public String login() {

        return "login";
    }

}


//https://bel.cultreg.ru/uploads/efbfbebd1e1b59c1f45e29f185f4f536.jpeg