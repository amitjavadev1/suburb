package com.example.demo.repository;

import com.example.demo.entity.Suburb;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuburbRepository extends CrudRepository<Suburb,Long> {
}
