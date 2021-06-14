package MiProyecto.App1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import MiProyecto.App1.Model.Stock;

public interface StockRepository extends JpaRepository<Stock, Long>{
    
}
