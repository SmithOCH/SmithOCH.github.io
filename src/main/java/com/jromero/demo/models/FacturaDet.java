package com.jromero.demo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="facturas_detalles")
public class FacturaDet implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name="det_id")
       private Long id;
	  @Column(name="det_cantidad")
       private int cantidad;
}
