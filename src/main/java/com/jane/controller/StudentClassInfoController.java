package com.jane.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jane.model.ClassInfo;
import com.jane.model.Student;
import com.jane.repository.ClassInfoRepository;
import com.jane.repository.StudentRepository;

@RestController
public class StudentClassInfoController {
    
    @Autowired
    private ClassInfoRepository classInfoRepository;
    @Autowired
    private StudentRepository studentRepository;
    
    @GetMapping("/classes/student/{id}")
    public List<ClassInfo> getClassInfoByStudentId(@PathVariable(value = "id") Long studentId) {
        
        List<ClassInfo> classes = null;
        
        Optional<Student> student = studentRepository.findById(studentId);
        
        if(student.isPresent()) {
            classes = classInfoRepository.findAllByStudent(student.get());
        }
        
        return classes;
    }

}
