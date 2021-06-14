package MiProyecto.App1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiProyecto.App1.Repository.StockRepository;
import lombok.Data;

@Service @Data
public class StockService {
    
    @Autowired
    private StockRepository stockrepo;
}
