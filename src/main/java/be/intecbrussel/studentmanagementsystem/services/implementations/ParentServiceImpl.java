package be.intecbrussel.studentmanagementsystem.services.implementations;

import be.intecbrussel.studentmanagementsystem.entity.Parent;
import be.intecbrussel.studentmanagementsystem.repositories.ParentRepository;
import be.intecbrussel.studentmanagementsystem.services.interfaces.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentServiceImpl implements ParentService {

    @Autowired
    private ParentRepository parentRepository;


    @Override
    public List<Parent> getAllParents() {
        return parentRepository.findAll();
    }

    @Override
    public Parent saveParent(Parent parent) {
        return parentRepository.save(parent);
    }

    @Override
    public Parent getParentById(Long id) {
        return parentRepository.findById(id).get();
    }

    @Override
    public Parent getParentByEmail(String email) {
        return parentRepository.findByEmail(email);
    }

    @Override
    public Parent updateParent(Parent parent) {
        return parentRepository.save(parent);
    }

    @Override
    public void deleteParentById(Long id) {
        parentRepository.deleteById(id);

    }
}
