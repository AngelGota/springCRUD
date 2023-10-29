package com.springcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.springcrud.repository.*;

@Controller
public class ProductoController {
	@Autowired
	private IProductoRepository repoProducto;
	@Autowired
	private ICategoriaRepository repoCat;
	@Autowired
	private IProveedorRepository repoProve;
	@GetMapping("/ListaProducto")
	public String ListaProducto(Model model) {
		model.addAttribute("lstCategorias", repoCat.findAll());
		model.addAttribute("lstProveedores", repoProve.findAll());
		model.addAttribute("lstProductos", repoProducto.findAll());
		return "crudproductos";
	}
}
