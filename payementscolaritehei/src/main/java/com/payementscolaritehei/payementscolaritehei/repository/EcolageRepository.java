package com.payementscolaritehei.payementscolaritehei.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payementscolaritehei.payementscolaritehei.model.Ecolage;

@Repository
public interface EcolageRepository extends JpaRepository<Ecolage, Integer>{
    
}
