package com.payementscolaritehei.payementscolaritehei.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payementscolaritehei.payementscolaritehei.repository.GroupRepository;
import com.payementscolaritehei.payementscolaritehei.model.Group;

import Lombok.AllArgsConstructor

@Service
@AllArgsConstructor
public class GroupService {
   @Autowired
   private GroupRepository groupRepository;

   public List<Group> getAllGroups(){
      return groupRepository.findAll();
   }

   public Optional<Group> getGroup(Integer id){
      return groupRepository.findById(id);
   }

   public Group addGroup(Group group){
      return groupRepository.save(group);
   }

   public void deleteGroup(Integer id){
      return groupRepository.deleteById(id);
   }
}
