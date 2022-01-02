package com.jromero.demo.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	private IFacturaDAO facturaDAO;
	
	@Override
	public void guardarFactura(Factura factura) {
		facturaDAO.save(factura);
		
	}

	@Override
	public List<Factura> mostrarFacturas() {
		return (List<Factura>)facturaDAO.findAll();
	}

	@Override
	public void eliminarFactura(Long id) {
		facturaDAO.deleteById(id);
		
	}

}
