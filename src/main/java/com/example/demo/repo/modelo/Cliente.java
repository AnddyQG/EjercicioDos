package com.example.demo.repo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "cliente")
public class Cliente {

	@Id

	@Column(name = "clie_cedula")
	private String cedula;
	
	@Column(name = "clie_nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "cliente")
	private List<Renta> rentas;
	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre +   "]";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Renta> getRentas() {
		return rentas;
	}

	public void setRentas(List<Renta> rentas) {
		this.rentas = rentas;
	}


	
	
}
