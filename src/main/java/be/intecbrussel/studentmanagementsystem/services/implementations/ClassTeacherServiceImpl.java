package be.intecbrussel.studentmanagementsystem.services.implementations;

import be.intecbrussel.studentmanagementsystem.entity.ClassTeacher;
import be.intecbrussel.studentmanagementsystem.repositories.ClassTeacherRepository;
import be.intecbrussel.studentmanagementsystem.services.interfaces.ClassTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassTeacherServiceImpl implements ClassTeacherService {

    @Autowired
    private ClassTeacherRepository classTeacherRepository;


    @Override
    public ClassTeacher getClassTeacherById(Long id) {
        return classTeacherRepository.findById(id).get();
    }

    @Override
    public ClassTeacher createClassTeacher(ClassTeacher classTeacher) {
        return classTeacherRepository.save(classTeacher);
    }

    @Override
    public void save(ClassTeacher classTeacher) {
        classTeacherRepository.save(classTeacher);
    }
}
