package com.example.demo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Cliente;

import ch.qos.logback.core.net.server.Client;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class ClienteRepoImpl implements IClienteRepo{
@Autowired
private EntityManager entityManager;
	@Override
	public void agregar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cliente);
	}

	@Override
	public Cliente encontrar(String cedula) {
		// TODO Auto-generated method stub
		Cliente cliente= this.entityManager.find(Cliente.class, cedula);
		return cliente;
	}

}
