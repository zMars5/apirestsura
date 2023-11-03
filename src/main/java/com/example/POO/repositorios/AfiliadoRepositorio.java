package com.example.POO.repositorios;

import com.example.POO.entidades.Afiliado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AfiliadoRepositorio extends JpaRepository<Afiliado, Integer> {



}
