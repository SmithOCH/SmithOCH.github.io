package com.jromero.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jromero.demo.models.Cliente;
import com.jromero.demo.models.IClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private IClienteService clienteService;
	
	@RequestMapping("/")
	public String inicio (Model model) {
		Cliente cliente = new Cliente();
		model.addAttribute("cliente", cliente);
		model.addAttribute("listaClientes", clienteService.cargarClientes());
		return "cliente/index";
	}
	@RequestMapping("/form")
	public String guardar (Cliente cliente) {
		clienteService.guardarCliente(cliente);
		return "redirect:/cliente/";
	}
	@RequestMapping("/eliminar/{id}")
	public String eliminar (@PathVariable (value = "id") Long id) {
		clienteService.eliminarCliente(id);
		return "redirect:/cliente/";
	}

}
