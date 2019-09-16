package com.java.tutorial.services;

import com.java.tutorial.entities.Department;
import com.java.tutorial.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Iterable<Department> getAll() { return departmentRepository.findAll(); }

    public Department create(Department department) { return departmentRepository.save(department); }

    public void deleteAll() { departmentRepository.deleteAll(); }

}
