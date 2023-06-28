package com.example.demo.repo.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "renta")
public class Renta {
	
	
	@Id
	@SequenceGenerator(name = "seq_renta", sequenceName = "seq_renta", allocationSize = 1)
	@GeneratedValue(generator = "seq_renta", strategy = GenerationType.SEQUENCE)
	@Column(name = "rent_id")
	private Integer id;
	@Column(name = "rent_fecha")
	private LocalDate fecha;
	@Column(name = "rent_n_dias")
	private Integer nDias;
	@Column(name = "rent_valor")
	private BigDecimal valor;
	
	
	
	@ManyToOne
	@JoinColumn(name = "auto_placa_rent")
	private Automovil automovil;
	
	@ManyToOne
	@JoinColumn(name ="cliente_cedula_rent" )
	private Cliente cliente;
	
	@OneToOne(mappedBy = "renta",cascade = CascadeType.ALL)
	private Pago pago;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Integer getnDias() {
		return nDias;
	}

	public void setnDias(Integer nDias) {
		this.nDias = nDias;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Automovil getAutomovil() {
		return automovil;
	}

	public void setAutomovil(Automovil automovil) {
		this.automovil = automovil;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	@Override
	public String toString() {
		return "Renta [id=" + id + ", fecha=" + fecha + ", nDias=" + nDias + ", valor=" + valor + ", automovil="
				+ automovil + ", cliente=" + cliente + ", pago=" + pago + "]";
	}
	
	
	
	
	
}
