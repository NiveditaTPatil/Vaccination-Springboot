package com.Vaccination.Vaccination.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Vaccination.Vaccination.Model.User;

@Repository
public interface VaccineRepositary extends JpaRepository<User, Integer>{
    
}