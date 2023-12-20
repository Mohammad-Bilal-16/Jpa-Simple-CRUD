package com.example.crudJDSession.controllers;

import com.example.crudJDSession.dto.CreateStudentRequest;
import com.example.crudJDSession.dto.UpdateStudentRequest;
import com.example.crudJDSession.models.Student;
import com.example.crudJDSession.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    //TODO: -> CRUD   CREATE , READ(byID , All) , UPDATE , DELETE

    @Autowired
    StudentService studentService;

    //Create API
    @PostMapping("")
    public Student createStudent(@RequestBody CreateStudentRequest createStudentRequest){
        return studentService.createStudent(createStudentRequest.to());
    }
    //Read API by ID
    @GetMapping("")
    public Student getStudentById(@RequestParam("id") int id){
        return studentService.getById(id);
    }
    //Read API by All
    @GetMapping("/all")
    public List<Student> getAllStudent(){
        return studentService.getAll();
    }

    //Update API
    @PutMapping("")
    public Student updateById(@RequestParam("id") int id,
                              @RequestBody UpdateStudentRequest updateStudentRequest){
        return studentService.update(id , updateStudentRequest.to());

    }
    //Delete API
    @DeleteMapping("")
    public void deleteById(@RequestParam("id") int id){
         studentService.deleteById(id);
    }

}
