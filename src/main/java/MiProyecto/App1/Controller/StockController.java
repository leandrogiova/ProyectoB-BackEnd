package MiProyecto.App1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import MiProyecto.App1.Service.StockService;
import lombok.Data;

@Controller @Data
public class StockController {
    
    @Autowired
    private StockService stockServi;
}
