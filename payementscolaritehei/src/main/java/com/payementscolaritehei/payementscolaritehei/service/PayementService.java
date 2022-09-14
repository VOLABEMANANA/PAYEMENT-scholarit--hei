package com.payementscolaritehei.payementscolaritehei.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.payementscolaritehei.payementscolaritehei.repository.PayementRepository;

@Service
public class PayementService {
    @Autowired
    private PayementRepository PayementRepository;
}
