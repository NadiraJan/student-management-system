package be.intecbrussel.studentmanagementsystem.controllers;

import be.intecbrussel.studentmanagementsystem.entity.TimeTable;
import be.intecbrussel.studentmanagementsystem.services.interfaces.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TimeTableController {

    @Autowired
    private TimeTableService timeTableService;






}
