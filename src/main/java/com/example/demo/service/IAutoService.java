package com.example.demo.service;

import com.example.demo.repo.modelo.Automovil;

public interface IAutoService {

	public void insertar(Automovil automovil);
	public Automovil buscar(String placa);
	public Automovil buscarPorPlacaQuery(String placa);
	public Automovil buscarPorPlacaTyped(String placa);
	public Automovil buscarPorPlacaNative(String placa);
	public Automovil buscarPorPlacaNamed(String placa);
	
	public Automovil buscarPorPlacaCriteria(String placa);
	
}
