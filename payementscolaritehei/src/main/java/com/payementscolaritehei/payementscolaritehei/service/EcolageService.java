package com.payementscolaritehei.payementscolaritehei.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payementscolaritehei.payementscolaritehei.repository.EcolageRepository;

@Service
public class EcolageService {
    @Autowired
    private EcolageRepository EcolageRepository;
    
}
