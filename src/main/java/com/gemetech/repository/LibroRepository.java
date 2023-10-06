package com.gemetech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gemetech.entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {

}
