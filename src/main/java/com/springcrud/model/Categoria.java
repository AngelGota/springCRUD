package com.springcrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "ctga_spring")
@Data
public class Categoria {
	@Id
	private int id_cate;
	private String nom_cate;
}
