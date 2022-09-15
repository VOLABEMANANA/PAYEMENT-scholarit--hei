package com.payementscolaritehei.payementscolaritehei.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.payementscolaritehei.payementscolaritehei.service.GroupService;
import com.payementscolaritehei.payementscolaritehei.model.Group;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class GroupContraller {
    private GroupService groupService;
    
    @GetMapping("/groups")
    public List<Group> getAllGroups(){
        return groupService.getAllGroups();
    }

    @GetMapping("/group/{id}")
    public Optional<Group> getGroupById(@PathVariable Integer id){
        return groupService.getGroup(id);
    }

    @PostMapping("/group")
    public Group addGroup(@RequestBody Group group){
        return groupService.addGroup(group);
    }

    @DeleteMapping("/group/{id}")
    public void deleteGroup(@PathVariable Integer id){
        groupService.deleteGroup(id);
    }
}
