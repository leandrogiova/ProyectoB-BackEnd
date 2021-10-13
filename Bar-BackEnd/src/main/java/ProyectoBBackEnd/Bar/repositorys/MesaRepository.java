package ProyectoBBackEnd.Bar.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProyectoBBackEnd.Bar.models.Mesa;

@Repository
public interface MesaRepository extends JpaRepository<Mesa, Long> {
    
}

