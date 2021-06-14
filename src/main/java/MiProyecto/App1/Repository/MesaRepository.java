package MiProyecto.App1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MiProyecto.App1.Model.Mesa;


@Repository
public interface MesaRepository extends JpaRepository<Mesa, Long>{

}