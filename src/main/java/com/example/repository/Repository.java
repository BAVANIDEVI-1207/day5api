package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.Model;


public interface Repository extends JpaRepository<Model, Integer> {

}

