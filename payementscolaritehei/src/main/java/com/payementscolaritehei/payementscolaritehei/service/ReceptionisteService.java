package com.payementscolaritehei.payementscolaritehei.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payementscolaritehei.payementscolaritehei.repository.ReceptionisteRepository;
import com.payementscolaritehei.payementscolaritehei.model.Receptioniste;

import Lombok.AllArgsConstructor

@Service
@AllArgsConstructor
public class ReceptionisteService {
   @Autowired
   private ReceptionisteRepository receptionisteRepository;

   public List<Receptioniste> getAllReceptionistes(){
      return receptionisteRepository.findAll();
   }

   public Optional<Receptioniste> getReceptioniste(Integer id){
      return receptionisteRepository.findById(id);
   }

   public Receptioniste addReceptioniste(Receptioniste receptioniste){
      return receptionisteRepository.save(receptioniste);
   }

   public void deleteReceptioniste(Integer id){
      return receptionisteRepository.deleteById(id);
   }

}
