package be.intecbrussel.studentmanagementsystem.services.interfaces;

import be.intecbrussel.studentmanagementsystem.entity.ClassTeacher;

public interface ClassTeacherService {

    ClassTeacher getClassTeacherById(Long id);
    ClassTeacher createClassTeacher(ClassTeacher classTeacher);

    void save(ClassTeacher classTeacher);
}
