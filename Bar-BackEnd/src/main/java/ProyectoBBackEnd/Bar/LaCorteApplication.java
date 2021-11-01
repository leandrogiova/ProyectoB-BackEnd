package ProyectoBBackEnd.Bar;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ProyectoBBackEnd.Bar.models.Mesa_Producto;
import ProyectoBBackEnd.Bar.models.Producto;
import ProyectoBBackEnd.Bar.repositorys.MesaProductosRepository;
import ProyectoBBackEnd.Bar.repositorys.ProductoRepository;

@SpringBootApplication
public class LaCorteApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaCorteApplication.class, args);
	}
	
/*
	@Bean
	public CommandLineRunner loadAgendaData(ProductoRepository productoRepo, MesaProductosRepository mesaProductosRepo){
		return (args) -> {

			Producto p1 = new Producto();
			p1.setId((long) 1008);
			p1.setNombre("Factura con Crema");
			p1.setNumeroProducto(91);
			p1.setPrecio(35);
			productoRepo.save(p1);


			Producto p2 = new Producto();
			p1.setId((long) 1009);
			p1.setNombre("Alfajor de Maicena");
			p1.setNumeroProducto(92);
			p1.setPrecio(40);
			productoRepo.save(p2);
			
			ArrayList<Producto> lista = new ArrayList<Producto>();
			lista.add(p1);
			lista.add(p2);
		
			Mesa_Producto m1 = new Mesa_Producto();
			m1.setId((long) 1009);
			m1.setNumero_mesa((long) 89);
			m1.setListaProductos(lista);
			m1.setEstado(true);
		
		};
	}
*/


}
 