package com.payementscolaritehei.payementscolaritehei.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payementscolaritehei.payementscolaritehei.model.Student;
import com.payementscolaritehei.payementscolaritehei.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(Integer id){
        return studentRepository.findById(id);
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    public void deleteStudent(Integer id){
        studentRepository.deleteById(id);
    }
}
