package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IClienteRepo;
import com.example.demo.repo.modelo.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteRepo clienteRepo;
	
	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
	this.clienteRepo.agregar(cliente);	
	}

	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.clienteRepo.encontrar(cedula);
	}

}
