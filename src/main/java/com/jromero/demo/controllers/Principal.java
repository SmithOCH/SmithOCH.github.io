package com.jromero.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jromero.demo.models.ICategoriaService;
import com.jromero.demo.models.IProductoService;
import com.jromero.demo.models.Producto;

@Controller
@RequestMapping("/principal")
public class Principal {
	
	@Autowired
	private IProductoService productoService;
	@Autowired
	private ICategoriaService categoriaService;
	
	 @RequestMapping ("/")
	 public String inicio(Model model) {
		 
		 Producto producto  = new Producto();
		 model.addAttribute("producto", producto);
		 model.addAttribute("listaProductos", productoService.mostrarProductos());
		 model.addAttribute("listaCategorias", categoriaService.cargarCategorias());
		 return "principal/index";
	 }

}
