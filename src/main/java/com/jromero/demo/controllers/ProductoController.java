package com.jromero.demo.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jromero.demo.models.ICategoriaService;
import com.jromero.demo.models.IProductoService;
import com.jromero.demo.models.Producto;

@Controller
@RequestMapping("/producto")
public class ProductoController {
	  
	@Autowired
	  private ICategoriaService categoriaService;
	@Autowired
	 private IProductoService productoService;
	 
     @RequestMapping ("/")
	  public String inicio(Model model) {
    	 Producto producto = new Producto();
    	 model.addAttribute("producto", producto);
    	 model.addAttribute("listaCategorias", categoriaService.cargarCategorias());
    	 model.addAttribute("listaProductos", productoService.mostrarProductos());
		  return "producto/index";
	  }
     
     @RequestMapping(value="/form", method = RequestMethod.POST)
     public String guardar( @ModelAttribute Producto producto, BindingResult result, @RequestParam("file") MultipartFile imagen) {
    	 
    	 if (!imagen.isEmpty()) {
			Path directorioImagenes = Paths.get("src//main//resources//static/images");
			String rutaAbsoluta = directorioImagenes.toFile().getAbsolutePath();
			
			try {
				byte[] bytesImg = imagen.getBytes();
				Path rutaCompleta = Paths.get(rutaAbsoluta + "//"+ imagen.getOriginalFilename());
				Files.write(rutaCompleta, bytesImg);
				
				producto.setImagen(imagen.getOriginalFilename());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
    	 productoService.guardarProducto(producto);
    	 return "redirect:/producto/";
     }
     
     
     @RequestMapping("/eliminar/{id}")
 	public String eliminar(@PathVariable(value = "id") Long id) {
 		productoService.eliminarProducto(id);
 		return "redirect:/producto/";
 	}
     
}
