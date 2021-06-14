package MiProyecto.App1.Repository;

import MiProyecto.App1.Model.MesaProducto;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface MesaProductosRepository extends JpaRepository<MesaProducto, Long>{

}