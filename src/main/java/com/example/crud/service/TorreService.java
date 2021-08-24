package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.example.crud.entity.Torre;
import com.example.crud.repository.TorreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TorreService {

    @Autowired
    TorreRepository torreRepository;

    public List<Torre> listaTorre() {
        return torreRepository.findAll();
    }

    public Optional<Torre> getTorre(int idTorre) {
        return torreRepository.findById(idTorre);
    }

    public Optional<Torre> getByNombreTorre(String nombreTorre) {
        return torreRepository.findByNombreTorre(nombreTorre);
    }

    public void saveTorre(Torre torre) {
        torreRepository.save(torre);
    }

    public void deleteTorre(int idTorre) {
        torreRepository.deleteById(idTorre);
    }

    public boolean existsByIdTorre(int idTorre) {
        return torreRepository.existsById(idTorre);
    }

    public boolean existsByNombreTorre(String nombreTorre) {
        return torreRepository.existsByNombreTorre(nombreTorre);
    }
    
}
