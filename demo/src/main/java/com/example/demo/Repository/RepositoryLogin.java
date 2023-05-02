package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bikes.ModelLogin;


public interface RepositoryLogin extends JpaRepository<ModelLogin, Integer> {

	ModelLogin findByuname(String uname);
}

