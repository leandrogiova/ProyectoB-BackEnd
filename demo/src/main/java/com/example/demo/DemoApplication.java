package com.example.demo;

import java.util.List;

import com.example.demo.controller.ProductoController;
import com.example.demo.models.*;
import com.example.demo.repository.ProductoRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	

		ProductoController miControllerProducto;
		miControllerProducto = new ProductoController();
		Producto p1;
		p1 = new Producto((long) 13, "medialuna", 1000);

		//https://www.youtube.com/watch?v=iW3a2lcYh7w&ab_channel=ElivarLargo

/*		
		System.out.println("HYLA\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		ProductoController miControllerProducto;
		miControllerProducto = new ProductoController();
		List<Producto> milista;
		milista = miControllerProducto.miNuevaFuncionGet();

		System.out.println(milista);
*/	
	}

	@Bean
	//son los objetos que va a gestionar automaticamente Spring
	// poniendole @Bean a un objeto, hago que Spring gestione ese metodo
	public CommandLineRunner loadAgendaData(ProductoRepository repository){
		return (args) -> {

//			Producto p1 = new Producto((long) 10, "Coca-Cola", 130);
			//repository.save(p1);
		};
	}




}
