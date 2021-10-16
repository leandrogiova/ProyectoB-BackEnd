package ProyectoBBackEnd.Bar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
			p1.setNombre("Medialuna");
			p1.setNumeroProducto(90);
			p1.setPrecio(32);
			productoRepo.save(p1);

	
		};
	}
*/
}
 