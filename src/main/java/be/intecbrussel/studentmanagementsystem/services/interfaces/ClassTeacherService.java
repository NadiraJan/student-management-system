package be.intecbrussel.studentmanagementsystem.services.interfaces;

import be.intecbrussel.studentmanagementsystem.entity.ClassTeacher;

public interface ClassTeacherService {

    ClassTeacher getAllClassTeacher();

    ClassTeacher getClassTeacherById(Long id);

    ClassTeacher createClassTeacher(ClassTeacher classTeacher);

    ClassTeacher getClassTeacherByEmail(String email);

    void save(ClassTeacher classTeacher);
}
