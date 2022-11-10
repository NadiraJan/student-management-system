package be.intecbrussel.studentmanagementsystem.services.implementations;

import be.intecbrussel.studentmanagementsystem.entity.Results;
import be.intecbrussel.studentmanagementsystem.repositories.ResultsRepository;
import be.intecbrussel.studentmanagementsystem.services.interfaces.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultsServiceImpl implements ResultsService {

    @Autowired
    private ResultsRepository resultsRepository;


    @Override
    public List<Results> getAllResults() {
        return resultsRepository.findAll();
    }

    @Override
    public Results createResults(Results results) {
        return resultsRepository.save(results);
    }

    @Override
    public Results saveResults(Results results) {
        return resultsRepository.save(results);
    }
}
