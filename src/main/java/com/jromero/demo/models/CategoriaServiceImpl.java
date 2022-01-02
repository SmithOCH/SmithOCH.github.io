package com.jromero.demo.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements ICategoriaService {
     @Autowired
	 private ICategoriaDAO categoriaDAO;
	
	@Override
	public List<Categoria> cargarCategorias() {
		
		return (List<Categoria>)categoriaDAO.findAll();
	}

	@Override
	public void guardarCategoria(Categoria categoria) {
		categoriaDAO.save(categoria);
		
	}

	@Override
	public void eliminarCategoria(Long id) {
		categoriaDAO.deleteById(id);
		
	}

}
