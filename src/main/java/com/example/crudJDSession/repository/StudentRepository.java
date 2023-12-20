package com.example.crudJDSession.repository;

import com.example.crudJDSession.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student , Integer> {
}
