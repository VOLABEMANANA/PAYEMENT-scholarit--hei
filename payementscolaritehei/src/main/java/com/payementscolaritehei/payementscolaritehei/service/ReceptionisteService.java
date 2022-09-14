package com.payementscolaritehei.payementscolaritehei.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payementscolaritehei.payementscolaritehei.repository.StudentRepository;

@Service
public class ReceptionisteService {
   @Autowired
   private StudentRepository studentRepository;
}
