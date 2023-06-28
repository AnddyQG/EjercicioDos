package com.example.demo.repo.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;

import jakarta.persistence.Table;
@Entity
@Table(name = "automovil")
@NamedQuery(name = "Automovil.buscarPorPlaca",query = "SELECT e FROM Automovil e WHERE e.placa = :datoPlaca")
public class Automovil {

	@Id
	
	@Column(name = "auto_placa")
	private String placa;
	
	@Column(name = "auto_valor_dia")
	private BigDecimal valorPorDia;
	
	@OneToMany(mappedBy = "automovil",cascade = CascadeType.ALL)
	private List<Renta> rentas;

	@Override
	public String toString() {
		return "Automovil [placa=" + placa + ", valorPorDia=" + valorPorDia  + "]";
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public BigDecimal getValorPorDia() {
		return valorPorDia;
	}

	public void setValorPorDia(BigDecimal valorPorDia) {
		this.valorPorDia = valorPorDia;
	}

	public List<Renta> getRentas() {
		return rentas;
	}

	public void setRentas(List<Renta> rentas) {
		this.rentas = rentas;
	}
	
	
	
	
}
