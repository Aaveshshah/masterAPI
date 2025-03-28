package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MasterList;
import com.example.demo.service.MasterListService;

@RestController
@RequestMapping("/v2/master_list")
public class MasterListController {

    @Autowired
    private MasterListService service;

    @PostMapping
    public ResponseEntity<MasterList> createMasterList(@RequestBody MasterList masterList) {
        MasterList savedData = service.saveMasterList(masterList);
        return ResponseEntity.ok(savedData);
    }
}