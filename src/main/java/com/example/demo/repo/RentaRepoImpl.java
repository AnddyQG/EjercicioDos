package com.example.demo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Renta;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class RentaRepoImpl implements IRentaRepo{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void agregar(Renta renta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(renta);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Renta renta= this.entityManager.find(Renta.class, id);
		this.entityManager.remove(renta);
	}

}
