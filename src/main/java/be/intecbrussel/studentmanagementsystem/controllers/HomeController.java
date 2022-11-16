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


    @GetMapping("/admin/login")
    public String adminLoginPage(){
        return "admin/admin_login";
    }

    @GetMapping("/user/login")
    public String userLoginPage(){
        return "user/user_login";
    }
}


