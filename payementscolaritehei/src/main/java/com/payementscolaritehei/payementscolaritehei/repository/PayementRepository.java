package com.payementscolaritehei.payementscolaritehei.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payementscolaritehei.payementscolaritehei.model.Payement;

@Repository
public interface PayementRepository extends JpaRepository<Payement, Integer>{
    
}
