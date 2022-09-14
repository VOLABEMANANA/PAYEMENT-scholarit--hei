package com.payementscolaritehei.payementscolaritehei.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.payementscolaritehei.payementscolaritehei.service.StudentService;
import com.payementscolaritehei.payementscolaritehei.model.Student;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class StudentController {
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Optional<Student> getStudentById(@PathVariable Integer id){
        return studentService.getStudent(id);
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);
    }
}
