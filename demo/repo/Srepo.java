package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelS.Smodel;

@Repository
public interface Srepo  extends JpaRepository<Smodel,Integer>
{

}