package be.intecbrussel.studentmanagementsystem.controllers;

import be.intecbrussel.studentmanagementsystem.entity.Results;
import be.intecbrussel.studentmanagementsystem.entity.Subjects;
import be.intecbrussel.studentmanagementsystem.repositories.ResultsRepository;
import be.intecbrussel.studentmanagementsystem.services.interfaces.ResultsService;
import be.intecbrussel.studentmanagementsystem.services.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ResultsController {
    @Autowired
    private ResultsService resultsService;
    @Autowired
    private StudentService studentService;


    @GetMapping("/results/new")
    public String createResultsForm(Model model){
        Results results = new Results();
        model.addAttribute("results", results);
        return "create_results";
    }

  /* @PostMapping("/results")
    public String saveResults(@ModelAttribute("results")Results results){
        resultsService.saveResults(results);
        return "redirect:/results";
    }*/
}
