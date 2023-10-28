package com.springcrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "pdto_spring")
@Data
public class Producto {
	@Id
	private int id_prod;
	private String nom_prod;
	private double pre_prod;
	private int stock;
	private int id_prov;
	private int id_cate;
	
	@ManyToOne
	@JoinColumn(name = "id_prov", insertable = false, updatable = false)
	private Proveedor objProveedor;
	
	@ManyToOne
	@JoinColumn(name = "id_cate", insertable = false, updatable = false)
	private Categoria objCategoria;
}
