package com.example.demo.repo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "pago")
public class Pago {

	
	@Id
	@SequenceGenerator(name = "seq_pago", sequenceName = "seq_pago", allocationSize = 1)
	@GeneratedValue(generator = "seq_pago", strategy = GenerationType.SEQUENCE)
	@Column(name = "pago_id")
	private Integer id;
	@Column(name = "pago_n_tarjeta")
	private String nTarjeta;
	@Column(name = "pago_valor")
	private BigDecimal valor;
	
	
	
	
	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "renta_id_pago")
	private Renta renta;




	@Override
	public String toString() {
		return "Pago [id=" + id + ", nTarjeta=" + nTarjeta + ", valor=" + valor + ", renta=" + renta + "]";
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getnTarjeta() {
		return nTarjeta;
	}




	public void setnTarjeta(String nTarjeta) {
		this.nTarjeta = nTarjeta;
	}




	public BigDecimal getValor() {
		return valor;
	}




	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}




	public Renta getRenta() {
		return renta;
	}




	public void setRenta(Renta renta) {
		this.renta = renta;
	}
	
	
	
	
}
