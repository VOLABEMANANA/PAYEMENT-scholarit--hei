package com.payementscolaritehei.payementscolaritehei.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.payementscolaritehei.payementscolaritehei.service.ReceptionisteService;
import com.payementscolaritehei.payementscolaritehei.model.Receptioniste;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ReceptionisteController {
    private ReceptionisteService receptionisteService;

    @GetMapping("/receptionistes")
    public List<Receptioniste> getAllReceptionistes(){
        return receptionisteService.getAllReceptionistes();
    }

    @GetMapping("/receptioniste/{id}")
    public Optional<Receptioniste> getReceptionisteById(@PathVariable Integer id){
        return receptionisteService.getReceptioniste(id);
    }

    @PostMapping("/receptioniste")
    public Receptioniste addReceptioniste(@RequestBody Receptioniste receptioniste){
        return receptionisteService.addReceptioniste(receptioniste);
    }

    @DeleteMapping("/receptioniste/{id}")
    public void deleteReceptioniste(@PathVariable Integer id){
        receptionisteService.deleteReceptioniste(id);
    }
}
