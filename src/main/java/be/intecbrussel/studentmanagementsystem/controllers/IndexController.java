package be.intecbrussel.studentmanagementsystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }
    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile multiPartFile) throws IOException {
String baseDirectory = "C:\\Users\\Gebruiker\\IdeaProjects\\student-management-system\\src\\main\\resources\\static\\uploads\\";
multiPartFile.transferTo(new File(baseDirectory + "elise.crombez.jpg"));
return  "redirect:/index";

    }
}
