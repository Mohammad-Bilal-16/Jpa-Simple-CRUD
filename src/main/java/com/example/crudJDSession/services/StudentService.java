package com.example.crudJDSession.services;

import com.example.crudJDSession.models.Student;
import com.example.crudJDSession.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
    public Student getById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public Student update(int id, Student student) {
        Student newStudent = studentRepository.findById(id).orElse(null);

        /**
         * private Language language;
         *     private String address;
         *     private int age;
         */
        newStudent.setBranch(student.getBranch());
        newStudent.setAddress(student.getAddress());
        newStudent.setAge(student.getAge());
        newStudent.setLanguage(student.getLanguage());

        return studentRepository.save(newStudent);

    }

    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }
}
