package be.intecbrussel.studentmanagementsystem.services.interfaces;

import be.intecbrussel.studentmanagementsystem.entity.Results;
import be.intecbrussel.studentmanagementsystem.entity.Student;
import be.intecbrussel.studentmanagementsystem.entity.Subjects;

import java.lang.management.OperatingSystemMXBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface ResultsService {




List<Results>getResultsByStudent(Student student);

     Results createResults(Results results);
     Results saveResults(Results results);


    List <Results>getAllResults();
}
