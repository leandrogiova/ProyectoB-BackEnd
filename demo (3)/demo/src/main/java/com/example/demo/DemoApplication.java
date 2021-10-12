package com.example.demo;

import java.util.List;

import com.example.demo.controller.ProductoController;
import com.example.demo.models.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

}
