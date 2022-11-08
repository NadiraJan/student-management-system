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


//https://bel.cultreg.ru/uploads/efbfbebd1e1b59c1f45e29f185f4f536.jpeg