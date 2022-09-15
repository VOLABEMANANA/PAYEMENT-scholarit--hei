package com.payementscolaritehei.payementscolaritehei.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.payementscolaritehei.payementscolaritehei.model.Payement;
import com.payementscolaritehei.payementscolaritehei.service.PayementService;

@RestController
public class PayementController {
    private PayementService payementService;
    
    @GetMapping("/payements")
    public List<Payement> getAllPayements(){
        return payementService.getAllPayements();
    }

    @GetMapping("/payement/{id}")
    public Optional<Payement> getPayementById(@PathVariable Integer id){
        return payementService.getPayement(id);
    }

    @PostMapping("/payement")
    public Payement addPayement(@RequestBody Payement payement){
        return payementService.addPayement(payement);
    }

    @DeleteMapping("/payement/{id}")
    public void deletePayement(@PathVariable Integer id){
        payementService.deletePayement(id);
    }

}
