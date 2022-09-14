package com.payementscolaritehei.payementscolaritehei.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.payementscolaritehei.payementscolaritehei.repository.GroupRepository;

@Service
public class GroupService {
    @Autowired
    private GroupRepository GroupRepository;
}
