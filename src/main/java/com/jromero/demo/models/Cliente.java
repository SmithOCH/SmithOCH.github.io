package com.jromero.demo.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cli_id")
	private Long id;
	@Column(name="cli_nombres")
	private String nombres;
	@Column(name="cli_primer_apellido")
	private String priapellido;
	@Column(name="cli_segundo_apellido")
	private String seapellido;
	@Column(name="genero")
	private String genero;	
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "cli_fecha_registro")
	private Date fechreg;
	@Column(name="celular")
	private int celular;
	
	@PrePersist
    @PreUpdate
    public void setFecha() {
    	fechreg = new Date();
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getPriapellido() {
		return priapellido;
	}
	public void setPriapellido(String priapellido) {
		this.priapellido = priapellido;
	}
	public String getSeapellido() {
		return seapellido;
	}
	public void setSeapellido(String seapellido) {
		this.seapellido = seapellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Date getFechreg() {
		return fechreg;
	}
	public void setFechreg(Date fechreg) {
		this.fechreg = fechreg;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	
	
	
	
}
