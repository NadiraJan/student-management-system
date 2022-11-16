package be.intecbrussel.studentmanagementsystem.services.interfaces;

import be.intecbrussel.studentmanagementsystem.entity.ClassTeacher;

import java.util.List;

public interface ClassTeacherService {

    ClassTeacher getClassTeacherById(Long id);
    ClassTeacher createClassTeacher(ClassTeacher classTeacher);
   ClassTeacher getClassTeacherByEmail(String email);

    void save(ClassTeacher classTeacher);
}
