package com.example.demo.controller;

import com.example.demo.dto.Suburb;
import com.example.demo.service.Impl.SuburbServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/suburb")
public class SuburbController {
    @Autowired
    SuburbServiceImpl service;

    @PostMapping()
    public ResponseEntity<String> savePlanet(
            @RequestBody final List<Suburb> suburbList) {
        service.save(suburbList);
        return new ResponseEntity<>("Data Saved", HttpStatus.CREATED);
    }
}
