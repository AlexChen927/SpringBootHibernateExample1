package com.jane.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jane.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
