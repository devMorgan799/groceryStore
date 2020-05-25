package com.example.grocery_springboot.repository;

import com.example.grocery_springboot.model.Candy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository

public interface CandyRepository extends JpaRepository<Candy, Long> {

}