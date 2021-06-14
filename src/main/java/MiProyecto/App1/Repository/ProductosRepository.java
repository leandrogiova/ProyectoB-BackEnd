package MiProyecto.App1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MiProyecto.App1.Model.Producto;


@Repository
public interface ProductosRepository extends JpaRepository<Producto, Long>{

}