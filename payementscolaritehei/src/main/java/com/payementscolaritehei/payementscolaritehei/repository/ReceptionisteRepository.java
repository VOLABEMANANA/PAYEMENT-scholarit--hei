package com.payementscolaritehei.payementscolaritehei.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payementscolaritehei.payementscolaritehei.model.Receptioniste;

@Repository
public interface ReceptionisteRepository extends JpaRepository<Receptioniste, Integer>{
    
}
