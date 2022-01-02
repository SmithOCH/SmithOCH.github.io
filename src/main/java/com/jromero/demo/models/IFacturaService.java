package com.jromero.demo.models;

import java.util.List;

public interface IFacturaService {
	public void guardarFactura(Factura factura);
    public List<Factura> mostrarFacturas();
    public void eliminarFactura(Long id);
}
