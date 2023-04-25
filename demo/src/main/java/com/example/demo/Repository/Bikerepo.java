package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.bikes.bikes;
@Repository

public interface Bikerepo extends JpaRepository<bikes, Integer> {

}
