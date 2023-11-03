package com.example.POO.repositorios;

import com.example.POO.entidades.SignoVital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignoVitalRepositorio extends JpaRepository<SignoVital, Integer> {
}
