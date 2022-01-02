package com.jromero.demo.models;

import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDAO extends CrudRepository<Usuario, Long>{

	public Usuario findByUsername(String username);
}
