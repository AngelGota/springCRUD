package com.springcrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "pvdr_spring")
@Data
public class Proveedor {
	@Id
	private int id_prov;
	private String nom_prov;
}
