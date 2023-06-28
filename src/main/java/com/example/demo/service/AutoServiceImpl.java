package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IAutoRepo;
import com.example.demo.repo.modelo.Automovil;
@Service
public class AutoServiceImpl implements IAutoService{

	@Autowired
	private IAutoRepo autoRepo;
	
	@Override
	public void insertar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.autoRepo.agregar(automovil);
	}

	@Override
	public Automovil buscar(String placa) {
		// TODO Auto-generated method stub
		return this.autoRepo.encontrar(placa);
	}

	@Override
	public Automovil buscarPorPlacaQuery(String placa) {
		// TODO Auto-generated method stub
		return this.autoRepo.encontrarPorPlacaQuery(placa);
	}

	@Override
	public Automovil buscarPorPlacaTyped(String placa) {
		// TODO Auto-generated method stub
		return this.autoRepo.encontrarPorPlacaTyped(placa);
	}

	@Override
	public Automovil buscarPorPlacaNative(String placa) {
		// TODO Auto-generated method stub
		return this.autoRepo.encontrarPorPlacaNative(placa);
	}

	@Override
	public Automovil buscarPorPlacaNamed(String placa) {
		// TODO Auto-generated method stub
		return this.autoRepo.encontrarPorPlacaNamed(placa);
	}

	@Override
	public Automovil buscarPorPlacaCriteria(String placa) {
		// TODO Auto-generated method stub
		return this.autoRepo.encontrarPorPlacaCriteria(placa);
	}

}
