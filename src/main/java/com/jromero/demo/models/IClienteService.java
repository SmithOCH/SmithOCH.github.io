package com.jromero.demo.models;

import java.util.List;

public interface IClienteService {
    public List<Cliente> cargarClientes();
    public void guardarCliente(Cliente cliente);
    public void eliminarCliente(Long id);
}
