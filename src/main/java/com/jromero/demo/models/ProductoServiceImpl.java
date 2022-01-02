package com.jromero.demo.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoDAO productoDAO;

	@Override
	public void guardarProducto(Producto producto) {
		productoDAO.save(producto);
		
	}

	@Override
	public List<Producto> mostrarProductos() {
		return (List<Producto>)  productoDAO.findAll();
	}

	@Override
	public void eliminarProducto(Long id) {
		productoDAO.deleteById(id);
		
	}
}
