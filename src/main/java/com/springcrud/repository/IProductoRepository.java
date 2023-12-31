package com.springcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springcrud.model.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer>{

}
