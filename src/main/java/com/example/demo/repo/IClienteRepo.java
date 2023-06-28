package com.example.demo.repo;

import com.example.demo.repo.modelo.Cliente;

public interface IClienteRepo {

	public void agregar(Cliente cliente);
	public Cliente encontrar(String cedula);
	
}
