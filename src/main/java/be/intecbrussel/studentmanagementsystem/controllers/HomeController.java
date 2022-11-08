package be.intecbrussel.studentmanagementsystem.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage(Model model){
        return "home";
    }
}


