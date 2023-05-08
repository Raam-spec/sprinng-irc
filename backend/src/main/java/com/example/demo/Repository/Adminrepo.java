package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.AdminModel;
@Repository

public interface Adminrepo extends JpaRepository<AdminModel, Integer> {

}
