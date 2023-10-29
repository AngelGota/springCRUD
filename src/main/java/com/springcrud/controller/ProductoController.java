package com.springcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import com.springcrud.model.Producto;
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
		model.addAttribute("producto",new Producto());
		model.addAttribute("lstCategorias", repoCat.findAll());
		model.addAttribute("lstProveedores", repoProve.findAll());
		model.addAttribute("lstProductos", repoProducto.findAll());
		return "crudproductos";
	}
	@GetMapping("/editar/{id_prod}")
	public String editar(@PathVariable Integer id_prod, Model model) {
		Producto p = repoProducto.findById(id_prod).get();
		model.addAttribute("producto",p);
		model.addAttribute("lstCategorias", repoCat.findAll());
		model.addAttribute("lstProveedores", repoProve.findAll());
		model.addAttribute("lstProductos", repoProducto.findAll());
		return "crudproductos";
	}
	@PostMapping("/grabar")
	public String grabar(@ModelAttribute Producto producto, Model model) {
		try {
			repoProducto.save(producto);
			model.addAttribute("mensaje", "Grabacion Correcta: ");
			model.addAttribute("cssmensaje", "alert alert-success");
		} catch (Exception e) {
			System.out.println(e.getCause().getMessage());
			model.addAttribute("mensaje", "Error en el guardado");
			model.addAttribute("cssmensaje", "alert alert-danger");
		}
		return "redirect:/ListaProducto";
	}
}
