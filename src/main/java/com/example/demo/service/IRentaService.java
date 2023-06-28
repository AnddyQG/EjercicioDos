package com.example.demo.service;

public interface IRentaService {

	public void realizar(String placa,String cedula,Integer nDias,String nTarjeta);
	public void borrar(Integer id);
}
