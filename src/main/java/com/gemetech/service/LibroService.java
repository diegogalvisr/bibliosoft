package com.gemetech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gemetech.entity.Libro;
import com.gemetech.repository.LibroRepository;

@Service
public class LibroService {

    @Autowired
    private LibroRepository lRepo;

    public void save(Libro l) {
        lRepo.save(l);
    }

    public List<Libro> getAllLibro() {
        return lRepo.findAll();
    }

    public Libro getLibroById(int id) {
        return lRepo.findById(id).get();
    }

    public void deleteById(int id) {
        lRepo.deleteById(id);
    }

}
