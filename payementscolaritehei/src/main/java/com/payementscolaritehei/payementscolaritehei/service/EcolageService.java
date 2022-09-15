package com.payementscolaritehei.payementscolaritehei.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payementscolaritehei.payementscolaritehei.repository.EcolageRepository;

import lombok.AllArgsConstructor;

import com.payementscolaritehei.payementscolaritehei.model.Ecolage;

@Service
@AllArgsConstructor
public class EcolageService {
   @Autowired
   private EcolageRepository ecolageRepository;
    
   public List<Ecolage> getAllEcolages(){
      return ecolageRepository.findAll();
   }

   public Optional<Ecolage> getEcolage(Integer id){
      return ecolageRepository.findById(id);
   }

   public Ecolage addEcolage(Ecolage ecolage){
      return ecolageRepository.save(ecolage);
   }

   public void deleteEcolage(Integer id){
      ecolageRepository.deleteById(id);
   }
}
