package MiProyecto.App1;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import MiProyecto.App1.Model.Mesa;
import MiProyecto.App1.Model.MesaProducto;
import MiProyecto.App1.Model.Producto;
import MiProyecto.App1.Model.Stock;
import MiProyecto.App1.Repository.MesaProductosRepository;
import MiProyecto.App1.Repository.MesaRepository;
import MiProyecto.App1.Repository.ProductosRepository;
import MiProyecto.App1.Repository.StockRepository;

@SpringBootApplication
public class App1Application {

	public static void main(String[] args) {
		SpringApplication.run(App1Application.class, args);
	}


	private Object True;

	
	@Bean
	public CommandLineRunner loadAgendaData(ProductosRepository productosRepository, MesaRepository mesaRepository, MesaProductosRepository mesaProductosRepository, StockRepository stockRepo){
	
		return (args) -> {
			Producto producto1 = new Producto(1,(long) 10, "Tostado", 120);
			Producto producto2 = new Producto(1,(long) 11, "Carlito", 150);
			Producto producto3 = new Producto(1,(long) 12, "MediaLuna", 40);
			Producto producto4 = new Producto(1,(long) 13, "Factura", 50);
			
			productosRepository.save(producto1);
			productosRepository.save(producto2);
			productosRepository.save(producto3);
			productosRepository.save(producto4);

			Set<Producto> listaProductos = new HashSet<Producto>();
			Mesa m1 = new Mesa( (long) 1, "mimesa", "10/1", (Boolean) True);

			
			MesaProducto miMesa = new MesaProducto((long) 1, listaProductos,  m1, 1);
			listaProductos.add(producto1);
			listaProductos.add(producto2);
			listaProductos.add(producto3);
			listaProductos.add(producto4);
			
			mesaRepository.save(m1);
			mesaProductosRepository.save(miMesa);
			

			//Set<Producto> nuevaLista = new HashSet<Producto>();
			//Stock nuevoStock = new Stock((long)1, nuevaLista, "10/01");
			//stockRepo.save(nuevoStock);
		};
	}



}

