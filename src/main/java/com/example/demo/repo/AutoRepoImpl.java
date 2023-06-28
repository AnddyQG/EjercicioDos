package com.example.demo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Automovil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutoRepoImpl implements IAutoRepo{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void agregar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.entityManager.persist(automovil);
	}

	@Override
	public Automovil encontrar(String placa) {
		// TODO Auto-generated method stub
		
		
		return this.entityManager.find(Automovil.class, placa);
	}

	@Override
	public Automovil encontrarPorPlacaQuery(String placa) {
		
		Query query= this.entityManager.createQuery("SELECT e FROM Automovil e WHERE e.placa = :datoPlaca");
		query.setParameter("datoPlaca", placa);
		
		return (Automovil)query.getSingleResult();
	}

	@Override
	public Automovil encontrarPorPlacaTyped(String placa) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> query=this.entityManager.createQuery("SELECT e FROM Automovil e WHERE e.placa = :datoPlaca",Automovil.class);
		query.setParameter("datoPlaca", placa);
		return query.getSingleResult();
	}

	@Override
	public Automovil encontrarPorPlacaNative(String placa) {
		// TODO Auto-generated method stub
		Query query=this.entityManager.createNativeQuery("SELECT * FROM automovil WHERE auto_placa = :datoPlaca", Automovil.class);
			query.setParameter("datoPlaca", placa);
		
		return (Automovil) query.getSingleResult();
	}

	@Override
	public Automovil encontrarPorPlacaNamed(String placa) {
		
		TypedQuery<Automovil>query =this.entityManager.createNamedQuery("Automovil.buscarPorPlaca", Automovil.class);
		query.setParameter("datoPlaca", placa);
		return query.getSingleResult();
	}

	@Override
	public Automovil encontrarPorPlacaCriteria(String placa) {
		// TODO Auto-generated method stub
		CriteriaBuilder builder=this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Automovil>criteriaQuery=builder.createQuery(Automovil.class);
		Root<Automovil> myTabla =criteriaQuery.from(Automovil.class);
		Predicate condicion = builder.equal(myTabla.get("placa"), placa);
		criteriaQuery.select(myTabla).where(condicion);
		
		TypedQuery<Automovil> query =this.entityManager.createQuery(criteriaQuery);
		
		
		
		
		return query.getSingleResult();
	}

}
