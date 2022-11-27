package be.intecbrussel.studentmanagementsystem.services.implementations;

import be.intecbrussel.studentmanagementsystem.entity.Results;
import be.intecbrussel.studentmanagementsystem.entity.Student;
import be.intecbrussel.studentmanagementsystem.repositories.ResultsRepository;
import be.intecbrussel.studentmanagementsystem.services.interfaces.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ResultsServiceImpl implements ResultsService {

    @Autowired
    private ResultsRepository resultsRepository;


    @Override
    public List<Results> getResultsByStudent(Student student) {
        return resultsRepository.findResultsByStudent(student);
    }

    @Override
    public Results createResults(Results results) {
        return resultsRepository.save(results);
    }

    @Override
    public Results saveResults(Results results) {
        return resultsRepository.save(results);
    }

    @Override
    public List<Results>getAllResults() {
        return resultsRepository.findAll();
    }


}
