package com.example.demo.service.Impl;

import com.example.demo.dto.Suburb;
import com.example.demo.repository.SuburbRepository;
import com.example.demo.service.SuburbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class SuburbServiceImpl implements SuburbService {
    @Autowired
    SuburbRepository repository;
    @Override
    public void save(List<Suburb> suburbList) {
        List<com.example.demo.entity.Suburb> suburbs = suburbList.stream().map( s->{com.example.demo.entity.Suburb temp= new com.example.demo.entity.Suburb();
        temp.setName(s.getName());temp.setPostCode(s.getPostCode());return temp;}).collect(Collectors.toList());
        repository.saveAll(suburbs);
    }
}
