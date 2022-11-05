package be.intecbrussel.studentmanagementsystem.services.implementations;

import be.intecbrussel.studentmanagementsystem.entity.TimeTable;
import be.intecbrussel.studentmanagementsystem.repositories.TimeTableRepository;
import be.intecbrussel.studentmanagementsystem.services.interfaces.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.Subject;

@Service
public class TimeTableServiceImpl implements TimeTableService{

    @Autowired
    TimeTableRepository timeTableRepository;


    @Override
    public void createTimeTable(TimeTable timeTable) {
         timeTableRepository.save(timeTable);
    }
}
