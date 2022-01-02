package com.jromero.demo.models;

import java.util.List;

public interface IProductoService {
    public void guardarProducto(Producto producto);
    public List<Producto> mostrarProductos();
    public void eliminarProducto(Long id);
}
