package com.springcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springcrud.model.Categoria;

@Repository
public interface ICategoriaRepository extends JpaRepository<Categoria, Integer>{

}
