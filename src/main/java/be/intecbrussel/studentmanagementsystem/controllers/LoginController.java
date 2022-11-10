package be.intecbrussel.studentmanagementsystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class LoginController {

    @GetMapping("/login")
    public String getLogine(){
        return "home";
    }


 /*   @GetMapping("/home")
    public String goHome(){
        return "home";
    }

    @GetMapping("/login")
    public String login(){
        return "home";
    }

    @GetMapping("/logout")
    public String logout(){
        return "login";
    }*/



}
