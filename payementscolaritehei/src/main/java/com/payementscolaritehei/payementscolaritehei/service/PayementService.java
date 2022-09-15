package com.payementscolaritehei.payementscolaritehei.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payementscolaritehei.payementscolaritehei.repository.PayementRepository;

import lombok.AllArgsConstructor;

import com.payementscolaritehei.payementscolaritehei.model.Payement;

@Service
@AllArgsConstructor
public class PayementService {
   @Autowired
   private PayementRepository payementRepository;

   public List<Payement> getAllPayements(){
      return payementRepository.findAll();
   }

   public Optional<Payement> getPayement(Integer id){
      return payementRepository.findById(id);
   }

   public Payement addPayement(Payement payement){
      return payementRepository.save(payement);
   }

   public void deletePayement(Integer id){
      payementRepository.deleteById(id);
   }

}
