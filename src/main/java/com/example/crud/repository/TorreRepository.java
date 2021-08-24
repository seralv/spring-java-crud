package com.example.crud.repository;

import java.util.Optional;

import com.example.crud.entity.Torre;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TorreRepository extends JpaRepository<Torre, Integer> {

    Optional<Torre> findByNombreTorre(String nombreTorre);

    boolean existsByNombreTorre(String nombreTorre);
    
}
