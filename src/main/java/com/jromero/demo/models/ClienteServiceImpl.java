package com.jromero.demo.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements IClienteService {
     @Autowired
	 private IClienteDAO clienteDAO;
	@Override
	public List<Cliente> cargarClientes() {		
		return (List<Cliente>)clienteDAO.findAll();
	}
	@Override
	public void guardarCliente(Cliente cliente) {
		clienteDAO.save(cliente);
		
	}
	@Override
	public void eliminarCliente(Long id) {
		clienteDAO.deleteById(id);
		
	}
	
	

}
