package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IAutoRepo;
import com.example.demo.repo.IClienteRepo;

import com.example.demo.repo.IRentaRepo;
import com.example.demo.repo.modelo.Automovil;
import com.example.demo.repo.modelo.Cliente;
import com.example.demo.repo.modelo.Pago;
import com.example.demo.repo.modelo.Renta;

@Service
public class RentaServiceImpl implements IRentaService{
@Autowired
private IRentaRepo iRentaRepo;
@Autowired
private IClienteRepo clienteRepo;
@Autowired
private IAutoRepo autoRepo;


	@Override
	public void realizar(String placa, String cedula, Integer nDias, String nTarjeta) {
		// TODO Auto-generated method stub
		Automovil automovil= this.autoRepo.encontrar(placa);
		Cliente cliente= this.clienteRepo.encontrar(cedula);
		Renta renta= new Renta();
		renta.setAutomovil(automovil);
		renta.setCliente(cliente);
		renta.setFecha(LocalDate.now());
		renta.setnDias(nDias);
		
		BigDecimal valorRenta= automovil.getValorPorDia().multiply(new BigDecimal(renta.getnDias()));
		renta.setValor(valorRenta);
		Pago pago= new Pago();
		pago.setnTarjeta(nTarjeta);
		pago.setRenta(renta);
		BigDecimal valorPago=renta.getValor().multiply(new BigDecimal(0.05));
		
		pago.setValor(valorPago);
		renta.setPago(pago);
		this.iRentaRepo.agregar(renta);
		
	}


	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iRentaRepo.eliminar(id);
	}

}
