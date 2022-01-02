package com.jromero.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jromero.demo.models.Categoria;
import com.jromero.demo.models.ICategoriaService;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
	@Autowired
	private ICategoriaService categoriaService;
	
	
	@RequestMapping("/")
	public String inicio(Model model) {
		Categoria categoria = new Categoria();
		model.addAttribute("categoria", categoria);
		model.addAttribute("listaCategorias", categoriaService.cargarCategorias());
		return "categoria/index";
	}
	
	@RequestMapping("/form")
	public String guardar(Categoria categoria) {
		categoriaService.guardarCategoria(categoria);
		return "redirect:/categoria/";
		
	}
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		categoriaService.eliminarCategoria(id);
		return "redirect:/categoria/";
	}

}
