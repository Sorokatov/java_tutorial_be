package com.java.tutorial.controllers;

import com.java.tutorial.entities.Department;
import com.java.tutorial.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/getAll")
    public ResponseEntity<?> getDepartments() {
        return new ResponseEntity<>(departmentService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> createDepartment (@RequestBody Department department) {
        return new ResponseEntity<>(departmentService.create(department), HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteAllDepartments() {
        departmentService.deleteAll();
        return new ResponseEntity<>((HttpStatus.OK));
    }
}
