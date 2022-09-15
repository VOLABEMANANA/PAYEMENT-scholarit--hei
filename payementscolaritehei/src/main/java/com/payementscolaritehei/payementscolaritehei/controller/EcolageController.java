package com.payementscolaritehei.payementscolaritehei.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.payementscolaritehei.payementscolaritehei.service.EcolageService;
import com.payementscolaritehei.payementscolaritehei.model.Ecolage;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class EcolageController {
    private EcolageService ecolageService;

    @GetMapping("/ecolages")
    public List<Ecolage> getAllEcolages(){
        return ecolageService.getAllEcolages();
    }

    @GetMapping("/ecolage/{id}")
    public Optional<Ecolage> getEcolageById(@PathVariable Integer id){
        return ecolageService.getEcolage(id);
    }

    @PostMapping("/ecolage")
    public Ecolage addEcolage(@RequestBody Ecolage ecolage){
        return ecolageService.addEcolage(ecolage);
    }

    @DeleteMapping("/ecolage/{id}")
    public void deleteEcolage(@PathVariable Integer id){
        ecolageService.deleteEcolage(id);
    }
}
