package be.intecbrussel.studentmanagementsystem.services.interfaces;

import be.intecbrussel.studentmanagementsystem.entity.Results;
import be.intecbrussel.studentmanagementsystem.entity.Subjects;

import java.util.List;

public interface ResultsService {

     List<Results> getAllResults();

     Results createResults(Results results);


}
