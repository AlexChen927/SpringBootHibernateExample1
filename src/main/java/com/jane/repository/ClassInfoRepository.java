package com.jane.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jane.model.ClassInfo;
import com.jane.model.Student;

@Repository
public interface ClassInfoRepository extends JpaRepository<ClassInfo, Long> {
        
    List<ClassInfo> findAllByStudent(Student student);
}
