package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Automovil;
import com.example.demo.repo.modelo.Cliente;
import com.example.demo.service.IAutoService;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IRentaService;

@SpringBootApplication
public class EjercicioDosApplication implements CommandLineRunner{

	@Autowired
	private IAutoService autoService;
	@Autowired
	private IClienteService clienteService;
	@Autowired
	private IRentaService iRentaService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioDosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Insertar auto y cliente
		
		Automovil automovil= new Automovil();
		automovil.setPlaca("2626");
		automovil.setValorPorDia(new BigDecimal(111));
		//this.autoService.insertar(automovil);
		
		Cliente cliente= new Cliente();
		cliente.setNombre("Juliana");
		cliente.setCedula("3050");
		
		//this.clienteService.insertar(cliente);
		//realizar renta
		
		//this.iRentaService.realizar("2626", "3050", 6, "bbc21");
		
		//Buscar el auto y el cliente
		
		Automovil automovilE= this.autoService.buscarPorPlacaQuery("2626");
		System.out.println(automovilE);
		
		Automovil automovilE2= this.autoService.buscarPorPlacaTyped("2626");
		System.out.println(automovilE2);
		
		Automovil automovilE3= this.autoService.buscarPorPlacaNative("2626");
		System.out.println(automovilE3);
			
		Automovil automovilE4= this.autoService.buscarPorPlacaNamed("2626");
		System.out.println(automovilE4);
		
		Automovil automovilE5= this.autoService.buscarPorPlacaCriteria("2626");
		System.out.println(automovilE5);
		
		Cliente cliente2=this.clienteService.buscar("3050");
		System.out.println(cliente2);
		
		//borrar renta y pago al mismo tiempo
		
		
		//this.iRentaService.borrar(4);
	
		
	}

}
