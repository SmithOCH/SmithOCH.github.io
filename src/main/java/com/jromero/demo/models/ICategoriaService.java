package com.jromero.demo.models;

import java.util.List;

public interface ICategoriaService {

     public List<Categoria> cargarCategorias();
     public void guardarCategoria(Categoria categoria);
     public void eliminarCategoria(Long id);
}
