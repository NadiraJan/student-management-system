package be.intecbrussel.studentmanagementsystem.controllers;

import be.intecbrussel.studentmanagementsystem.entity.Results;
import be.intecbrussel.studentmanagementsystem.entity.Student;
import be.intecbrussel.studentmanagementsystem.entity.Subjects;
import be.intecbrussel.studentmanagementsystem.services.interfaces.ResultsService;
import be.intecbrussel.studentmanagementsystem.services.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
public class ResultsController {
    @Autowired
    private ResultsService resultsService;
    @Autowired
    private StudentService studentService;


    @GetMapping("/results/{new}")
    public String createResultsForm(Model model){
        Results results = new Results();
        model.addAttribute("results", results);
        return "create_results";
    }


  @PostMapping("/results")
    public String saveResults(@ModelAttribute("results")Results results){
        resultsService.saveResults(results);
        return "redirect:/results";
    }

    @GetMapping("/results/{studentId}")
    public String seeAllResultsByStudentId(Model model, @PathVariable Long studentId){
        Student student = studentService.getStudentById(studentId);
        List<Results>results = resultsService.getResultsByStudent(student);
        model.addAttribute("results", results);
        model.addAttribute("results", new Results(0.0, Subjects.valueOf(""),"",student));

        return "results";
    }

    @GetMapping("/results")
    public String listResults(Model model) {

        model.addAttribute("results", resultsService.getAllResults());
        return "results";

    }
}
