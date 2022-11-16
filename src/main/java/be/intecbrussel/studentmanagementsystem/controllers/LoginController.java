package be.intecbrussel.studentmanagementsystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }


    @GetMapping("/logout")
    public String logout() {
        return "login";
    }


}
