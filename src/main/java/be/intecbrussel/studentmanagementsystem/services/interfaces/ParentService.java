package be.intecbrussel.studentmanagementsystem.services.interfaces;

import be.intecbrussel.studentmanagementsystem.entity.Parent;
import be.intecbrussel.studentmanagementsystem.entity.Student;

import java.util.List;

public interface ParentService {

    List<Parent> getAllParents();

    Parent saveParent(Parent parent);

    Parent getParentById(Long id);
    Parent getParentByEmail(String email);

    Parent updateParent(Parent parent);

    void deleteParentById(Long id);

}
