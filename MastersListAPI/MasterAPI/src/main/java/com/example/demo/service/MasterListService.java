package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MasterList;
import com.example.demo.repo.MasterListRepository;

@Service
public class MasterListService {

    @Autowired
    private MasterListRepository repository;

    public MasterList saveMasterList(MasterList masterList) {
        return repository.save(masterList);
    }
}

