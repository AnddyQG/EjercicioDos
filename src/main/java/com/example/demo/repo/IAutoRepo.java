package com.example.demo.repo;

import com.example.demo.repo.modelo.Automovil;

public interface IAutoRepo {

	public void agregar(Automovil automovil);
	public Automovil encontrar(String placa);
	public Automovil encontrarPorPlacaQuery(String placa);
	public Automovil encontrarPorPlacaTyped(String placa);
	public Automovil encontrarPorPlacaNative(String placa);
	public Automovil encontrarPorPlacaNamed(String placa);
	public Automovil encontrarPorPlacaCriteria(String placa);
	
}
